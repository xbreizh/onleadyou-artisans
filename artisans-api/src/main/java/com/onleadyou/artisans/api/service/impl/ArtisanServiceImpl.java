package com.onleadyou.artisans.api.service.impl;

import com.onleadyou.artisans.api.model.SearchCriteria;
import com.onleadyou.artisans.api.repository.contract.ArtisanRepository;
import com.onleadyou.artisans.api.model.Artisan;
import com.onleadyou.artisans.api.service.contract.ArtisanService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtisanServiceImpl implements ArtisanService {

    final ArtisanRepository repository;

    public ArtisanServiceImpl(final ArtisanRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Artisan> getArtisanById(final long id) {
        return Optional.ofNullable(repository.findById(id));
    }

    @Override
    public  Optional<List<Artisan>> getArtisanByCriteria(final SearchCriteria criteria) {
        return Optional.ofNullable(repository.searchUserByCriteria(criteria));
    }

    @Override
    public void updateArtisan(Artisan artisan) {
        repository.updateArtisan(artisan);
    }
    
}
