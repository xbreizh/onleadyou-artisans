package com.onleadyou.artisans.api.repository.contract;

import com.onleadyou.artisans.api.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JobRepository extends JpaRepository<Job, Long> {


}
