package com.onleadyou.artisans.api.controller.impl;


import com.onleadyou.artisans.api.controller.contract.ArtisanController;
import com.onleadyou.artisans.api.model.Artisan;
import com.onleadyou.artisans.api.model.SearchCriteria;
import com.onleadyou.artisans.api.service.contract.ArtisanService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/artisans")
public class ArtisanControllerImpl implements ArtisanController {

    final ArtisanService artisanService;

    public ArtisanControllerImpl(ArtisanService artisanService) {
        this.artisanService = artisanService;
    }

    @Override
    @GetMapping(value = "/{id}")
    public Optional<Artisan> getArtisan(@PathVariable("id") final long id) {
        return artisanService.getArtisanById(1);
    }

    @Override
    public Optional<Artisan> getArtisan(final SearchCriteria criteria) {
        return Optional.empty();
    }

    @Override
    public void updateArtisan(Artisan artisan) {

    }
}
