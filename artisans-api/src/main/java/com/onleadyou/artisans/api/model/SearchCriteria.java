package com.onleadyou.artisans.api.model;

public class SearchCriteria {

    String job;

    String city;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "SearchCriteria{" +
            "job='" + job + '\'' +
            ", city='" + city + '\'' +
        '}';
    }
}
