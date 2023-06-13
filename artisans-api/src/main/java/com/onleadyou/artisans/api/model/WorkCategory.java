package com.onleadyou.artisans.api.model;

import javax.persistence.*;

@Entity
@Table(name = "workcategory")
public final class WorkCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WorkCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
