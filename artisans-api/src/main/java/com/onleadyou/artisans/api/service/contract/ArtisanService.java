package com.onleadyou.artisans.api.service.contract;

import com.onleadyou.artisans.api.model.Artisan;

import java.util.Optional;

public interface ArtisanService {

    Optional<Artisan> getArtisanById(long id);

/*    Optional<User> getUserById(long id);

    List<Artisan> getArtisanByCriteria(SearchCriteria criteria);

    void updateArtisan(Artisan artisan);*/
}
