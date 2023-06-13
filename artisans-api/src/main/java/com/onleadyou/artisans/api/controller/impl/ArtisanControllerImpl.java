package com.onleadyou.artisans.api.controller.impl;


import com.onleadyou.artisans.api.controller.contract.ArtisanController;
import com.onleadyou.artisans.api.model.Artisan;
import com.onleadyou.artisans.api.model.SearchCriteria;
import com.onleadyou.artisans.api.service.contract.ArtisanService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
    public Optional<Artisan> getArtisanById(@PathVariable("id") final long id) {
        return artisanService.getArtisanById(1);
    }

    @Override
    @GetMapping(path = "/criteria")
    public Optional<List<Artisan>> getArtisanByCriteria(@RequestBody final SearchCriteria criteria) {
        return artisanService.getArtisanByCriteria(criteria);
    }

    @Override
    @PutMapping
    public void updateArtisan(@RequestBody final Artisan artisan) {
        artisanService.updateArtisan(artisan);
    }
}
