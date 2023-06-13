package com.onleadyou.artisans.api.repository.contract;

import com.onleadyou.artisans.api.model.Artisan;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArtisanRepository extends JpaRepository<Artisan, Long> {

    Artisan findById(long id);
  /*  Artisan getArtisanById(long id);

    List<Artisan> getArtisanByCriteria(SearchCriteria criteria);

    void updateArtisan(Artisan artisan);*/

}
