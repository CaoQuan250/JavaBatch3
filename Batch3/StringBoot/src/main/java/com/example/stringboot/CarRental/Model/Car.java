package com.example.stringboot.CarRental.Model;

import javax.persistence.*;
import java.util.Set;

@Entity

public class Car {
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "fuel")
    private String fuel;
    @Basic
    @Column(name = "mfg")
    private String mfg;
    @Basic
    @Column(name = "model")
    private String model;
    @Basic
    @Column(name = "photo")
    private String photo;
    @Basic
    @Column(name = "seat")
    private Integer seat;
    @Basic
    @Column(name = "price")
    private Double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_Id")
    private Brand brand;

    @OneToMany(mappedBy = "car", fetch = FetchType.LAZY)
    private Set<Booking> bookings;

    public Car(String id,
            String fuel,
               String mfg,
               String model,
               String photo,
               Integer seat,
               Double price,
               Brand brand) {
        this.id = id;
        this.fuel = fuel;
        this.mfg = mfg;
        this.model = model;
        this.photo = photo;
        this.seat = seat;
        this.price = price;
        this.brand = brand;
    }

    public Car() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getMfg() {
        return mfg;
    }

    public void setMfg(String mfg) {
        this.mfg = mfg;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Set<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(Set<Booking> bookings) {
        this.bookings = bookings;
    }
}
