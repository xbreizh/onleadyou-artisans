package com.onleadyou.artisans.api.service.impl;

import com.onleadyou.artisans.api.dao.contract.ArtisanRepository;
import com.onleadyou.artisans.api.model.City;
import com.onleadyou.artisans.api.model.Artisan;
import com.onleadyou.artisans.api.model.SearchCriteria;
import com.onleadyou.artisans.api.service.contract.ArtisanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtisanServiceImpl implements ArtisanService {

    final ArtisanRepository repository;

    public ArtisanServiceImpl(ArtisanRepository repository) {
        this.repository = repository;
    }

    @Override
    public Artisan getArtisanById(final long id) {
        return repository.getArtisanById(id);
    }

    @Override
    public List<Artisan> getArtisanByCriteria(final SearchCriteria criteria) {
        return repository.getArtisanByCriteria(criteria);
    }

    @Override
    public void updateArtisan(Artisan artisan) {
        repository.updateArtisan(artisan);
    }

    @Override
    public void updateArtisanAddress(long id, City location) {
        repository.updateArtisanAddress(id, location);
    }
}
