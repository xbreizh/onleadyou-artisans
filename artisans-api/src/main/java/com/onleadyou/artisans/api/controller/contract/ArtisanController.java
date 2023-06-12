package com.onleadyou.artisans.api.controller.contract;


import com.onleadyou.artisans.api.model.Artisan;

public interface ArtisanController {

    Artisan getArtisan(long id);

    void addArtisan(Artisan artisan);

    void updateArtisan(Artisan artisan);

    void removeArtisan(int id);
}
