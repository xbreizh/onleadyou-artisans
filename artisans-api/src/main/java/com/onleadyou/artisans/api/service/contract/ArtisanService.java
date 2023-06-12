package com.onleadyou.artisans.api.service.contract;

import com.onleadyou.artisans.api.model.City;
import com.onleadyou.artisans.api.model.Artisan;
import com.onleadyou.artisans.api.model.SearchCriteria;

import java.util.List;

public interface ArtisanService {

    Artisan getArtisanById(long id);

    List<Artisan> getArtisanByCriteria(SearchCriteria criteria);

    void updateArtisan(Artisan artisan);

    void updateArtisanAddress(long id, City location);
}
