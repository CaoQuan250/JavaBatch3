package com.example.stringboot.CarRental.Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;

@Entity
public class Location {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "startDate", fetch = FetchType.LAZY)
    private Set<Booking> bookings1;

    @OneToMany(mappedBy = "endDate", fetch = FetchType.LAZY)
    private Set<Booking> bookings2;

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


}
