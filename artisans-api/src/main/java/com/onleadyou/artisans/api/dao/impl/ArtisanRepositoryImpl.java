package com.onleadyou.artisans.api.dao.impl;

import com.onleadyou.artisans.api.dao.contract.ArtisanRepository;
import com.onleadyou.artisans.api.model.Address;
import com.onleadyou.artisans.api.model.Artisan;
import com.onleadyou.artisans.api.model.SearchCriteria;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArtisanRepositoryImpl implements ArtisanRepository {


    @Override
    public Artisan getArtisanById(long id) {
        System.out.println("reaching controller");
        final Artisan artisan = new Artisan();
        artisan.setCompany("onleadyou");
        artisan.setId(1);
        return new Artisan();
    }

    @Override
    public List<Artisan> getArtisanByCriteria(SearchCriteria criteria) {
        return null;
    }

    @Override
    public void updateArtisan(Artisan artisan) {

    }

    @Override
    public void updateArtisanAddress(long id, Address location) {

    }
}
