package com.onleadyou.artisans.api.service.impl;

import com.onleadyou.artisans.api.repository.contract.ArtisanRepository;
import com.onleadyou.artisans.api.model.Artisan;
import com.onleadyou.artisans.api.service.contract.ArtisanService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArtisanServiceImpl implements ArtisanService {

    final ArtisanRepository repository;
   // final UserRepository userRepository;

    public ArtisanServiceImpl(final ArtisanRepository repository) {
        this.repository = repository;
     //   this.userRepository = userRepository;
    }

    @Override
    public Optional<Artisan> getArtisanById(final long id) {
        return Optional.ofNullable(repository.findById(id));
    }


/*
    public Optional<User> getUserById(final long id) {
        return Optional.ofNullable(userRepository.findById(id));
    }

    @Override
    public List<Artisan> getArtisanByCriteria(final SearchCriteria criteria) {
        return repository.getArtisanByCriteria(criteria);
    }

    @Override
    public void updateArtisan(Artisan artisan) {
        repository.updateArtisan(artisan);
    }*/
    
}
