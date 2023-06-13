package com.onleadyou.artisans.api.controller.contract;


import com.onleadyou.artisans.api.model.Artisan;
import com.onleadyou.artisans.api.model.SearchCriteria;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface ArtisanController {

    Optional<Artisan> getArtisanById(long id);

    Optional<List<Artisan>> getArtisanByCriteria(SearchCriteria criteria);

    void updateArtisan(final Artisan artisan);

}
