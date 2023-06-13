package com.onleadyou.artisans.api.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Artisan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String company;

    private String address;

    private String email;
    private String phonenumber;

    private String keywords;

    @ManyToMany
    @JoinTable(
        name = "artisan_city",
        joinColumns = @JoinColumn(name = "artisan_id"),
        inverseJoinColumns = @JoinColumn(name = "city_id")
    )
    private Set<City> cities;

    @ManyToMany
    @JoinTable(
            name = "artisan_job",
            joinColumns = @JoinColumn(name = "artisan_id"),
            inverseJoinColumns = @JoinColumn(name = "job_id")
    )
    private Set<Job> jobs;

    public Artisan() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }

    public Set<Job> getJobs() {
        return jobs;
    }

    public void setJobs(Set<Job> jobs) {
        this.jobs = jobs;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Override
    public String toString() {
        return "Artisan{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", keywords='" + keywords + '\'' +
                ", cities=" + cities +
                ", jobs=" + jobs +
                '}';
    }
}
