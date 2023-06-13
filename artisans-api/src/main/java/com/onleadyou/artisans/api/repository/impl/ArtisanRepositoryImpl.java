package com.onleadyou.artisans.api.repository.impl;

import com.onleadyou.artisans.api.repository.contract.ArtisanRepository;
import com.onleadyou.artisans.api.model.Artisan;
import com.onleadyou.artisans.api.model.SearchCriteria;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
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
        final String queryString = "SELECT a FROM Artisan a WHERE a.email = :email";
        final Query query = entityManager.createQuery(queryString, Artisan.class);
        query.setParameter("email", criteria.getJob());
        return query.getResultList();
    }

    @Override
    public void updateArtisan(final Artisan artisan) {

    }
}
