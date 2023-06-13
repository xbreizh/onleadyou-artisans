package com.onleadyou.artisans.api.controller.contract;


import com.onleadyou.artisans.api.model.Artisan;
import com.onleadyou.artisans.api.model.SearchCriteria;

import java.util.Optional;

public interface ArtisanController {

    Optional<Artisan> getArtisan(long id);

    Optional<Artisan> getArtisan(SearchCriteria criteria);

    void updateArtisan(Artisan artisan);

}
