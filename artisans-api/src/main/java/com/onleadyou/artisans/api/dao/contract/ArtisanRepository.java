package com.onleadyou.artisans.api.dao.contract;

import com.onleadyou.artisans.api.model.Address;
import com.onleadyou.artisans.api.model.Artisan;
import com.onleadyou.artisans.api.model.SearchCriteria;

import java.util.List;

public interface ArtisanRepository {

    Artisan getArtisanById(long id);

    List<Artisan> getArtisanByCriteria(SearchCriteria criteria);

    void updateArtisan(Artisan artisan);

    void updateArtisanAddress(long id, Address location);
}
