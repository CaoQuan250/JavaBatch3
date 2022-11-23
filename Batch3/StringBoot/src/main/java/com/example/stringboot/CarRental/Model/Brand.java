package com.example.stringboot.CarRental.Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;

@Entity
public class Brand {

    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "brand", fetch = FetchType.LAZY)
    private Set<Car> car;

    public Brand(String id, String name) {
        this.id = id;
        this.name = name;

    }

    public Brand() {

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
