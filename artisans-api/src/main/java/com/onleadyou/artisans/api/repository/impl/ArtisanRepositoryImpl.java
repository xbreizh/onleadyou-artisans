package com.onleadyou.artisans.api.repository.impl;

import com.onleadyou.artisans.api.repository.contract.ArtisanRepository;
import com.onleadyou.artisans.api.model.Artisan;
import com.onleadyou.artisans.api.model.SearchCriteria;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class ArtisanRepositoryImpl implements ArtisanRepository{

    final EntityManager entityManager;

    public ArtisanRepositoryImpl(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Artisan findById(final long id) {
        final String queryString = "SELECT a FROM Artisan a WHERE a.id = :id";
        final Query query = entityManager.createQuery(queryString, Artisan.class);
        query.setParameter("id", id);
        return (Artisan) query.getSingleResult();
    }

    @Override
    public List<Artisan> searchUserByCriteria(final SearchCriteria criteria) {
        final StringBuilder sb = new StringBuilder();
        sb.append("SELECT a FROM Artisan a");

        boolean whereClauseAdded = false;

        if (criteria.getJob() != null && !criteria.getJob().isEmpty()) {
            sb.append(whereClauseAdded ? " AND" : " WHERE")
                    .append(" EXISTS (SELECT 1 FROM a.jobs j WHERE UPPER(j.name) = UPPER(:job))");
            whereClauseAdded = true;
        }

        if (criteria.getCity() != null && !criteria.getCity().isEmpty()) {
            sb.append(whereClauseAdded ? " AND" : " WHERE")
                    .append(" EXISTS (SELECT 1 FROM a.cities c WHERE UPPER(c.name) = UPPER(:city))");
        }

        final TypedQuery<Artisan> query = entityManager.createQuery(sb.toString(), Artisan.class);

        if (criteria.getJob() != null && !criteria.getJob().isEmpty()) {
            query.setParameter("job", criteria.getJob());
        }

        if (criteria.getCity() != null && !criteria.getCity().isEmpty()) {
            query.setParameter("city", criteria.getCity());
        }

        return query.getResultList();
    }

    @Override
    public void updateArtisan(final Artisan updatedArtisan) {
        final long artisanId = updatedArtisan.getId();
        final Optional<Artisan> optionalArtisan = Optional.ofNullable(this.findById(artisanId));
        if (optionalArtisan.isPresent()) {
            final Artisan artisan = optionalArtisan.get();

            // Update the artisan's fields only if the updated values are not null
            if (updatedArtisan.getCompany() != null) {
                artisan.setCompany(updatedArtisan.getCompany());
            }

            if (updatedArtisan.getEmail() != null) {
                artisan.setEmail(updatedArtisan.getEmail());
            }

            if (updatedArtisan.getPhonenumber() != null) {
                artisan.setPhonenumber(updatedArtisan.getPhonenumber());
            }

            if (updatedArtisan.getAddress() != null) {
                artisan.setAddress(updatedArtisan.getAddress());
            }

            if (updatedArtisan.getCities() != null) {
                artisan.setCities(updatedArtisan.getCities());
            }

            if (updatedArtisan.getJobs() != null) {
                artisan.setJobs(updatedArtisan.getJobs());
            }

            entityManager.merge(artisan);
        } else {
            throw new IllegalArgumentException("Artisan not found: " + artisanId);
        }
    }
}
