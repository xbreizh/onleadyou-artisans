package com.onleadyou.artisans.api.repository.contract;

import com.onleadyou.artisans.api.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<Job, Long> {

}
