package com.onleadyou.artisans.api.model;

public class Artisano {

    private long id;

    private String firstname;
    private String lastname;


    public Artisano() {
    }

    @Override
    public String toString() {
        return "Artisano{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
