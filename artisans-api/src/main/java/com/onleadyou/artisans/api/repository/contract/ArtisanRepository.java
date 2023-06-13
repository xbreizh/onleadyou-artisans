package com.onleadyou.artisans.api.repository.contract;

import com.onleadyou.artisans.api.model.Artisan;
import com.onleadyou.artisans.api.model.SearchCriteria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ArtisanRepository {

    Artisan findById(long id);

    List<Artisan> searchUserByCriteria(SearchCriteria criteria);

    void updateArtisan(Artisan artisan);
}
