package com.onleadyou.artisans.api.model;

import java.util.List;

public class Artisan {

    private long id;
    private String company;

    private String address;

    private City city;
    private String email;
    private int phoneNumber;

    private String specialty;
    private List<WorkCategory> categoryList;

    private List<String> keywords;

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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }


    public List<WorkCategory> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<WorkCategory> categoryList) {
        this.categoryList = categoryList;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }


    @Override
    public String toString() {
        return "Artisan{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", address='" + address + '\'' +
                ", city=" + city +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", specialty='" + specialty + '\'' +
                ", categoryList=" + categoryList +
                ", keywords=" + keywords +
                '}';
    }
}
