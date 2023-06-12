package com.onleadyou.artisans.api.service.impl;

import com.onleadyou.artisans.api.model.Address;
import com.onleadyou.artisans.api.model.Artisan;
import com.onleadyou.artisans.api.model.SearchCriteria;
import com.onleadyou.artisans.api.service.contract.ArtisanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtisanServiceImpl implements ArtisanService {
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
