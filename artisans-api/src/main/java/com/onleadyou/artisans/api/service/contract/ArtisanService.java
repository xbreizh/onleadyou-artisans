package com.onleadyou.artisans.api.service.contract;

import com.onleadyou.artisans.api.model.Artisan;
import com.onleadyou.artisans.api.model.SearchCriteria;

import java.util.List;
import java.util.Optional;

public interface ArtisanService {

    Optional<Artisan> getArtisanById(long id);
    Optional<List<Artisan>> getArtisanByCriteria(SearchCriteria criteria);

/*    Optional<User> getUserById(long id);

    List<Artisan> getArtisanByCriteria(SearchCriteria criteria);*/

    void updateArtisan(Artisan artisan);
}
