package com.onleadyou.artisans.api.model;

import java.util.List;

public class Artisan {

    private long id;
    private String company;

    private Address address;

    private String firstname;
    private String lastname;
    private String email;
    private int phoneNumber;

    private String expertise;
    private String activity;
    private List<WorkCategory> workCategoryList;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public List<WorkCategory> getWorkCategoryList() {
        return workCategoryList;
    }

    public void setWorkCategoryList(List<WorkCategory> workCategoryList) {
        this.workCategoryList = workCategoryList;
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
                ", address=" + address +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", expertise='" + expertise + '\'' +
                ", activity='" + activity + '\'' +
                ", workCategoryList=" + workCategoryList +
                ", keywords=" + keywords +
                '}';
    }

}
