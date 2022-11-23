package com.example.stringboot.CarRental.Dto;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class CarDto {

    private String id;
    private String fuel;
    private String mfg;
    private String model;
    private MultipartFile photo;
    private Integer seat;
    private Double price;
    private String brand;

    public CarDto() {

    }

    public CarDto(String id,
            String fuel,
                  String mfg,
                  String model,
                  MultipartFile photo,
                  Integer seat,
                  Double price,
                  String brand) {
        this.id = id;
        this.fuel = fuel;
        this.mfg = mfg;
        this.model = model;
        this.photo = photo;
        this.seat = seat;
        this.price = price;
        this.brand = brand;
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

    public MultipartFile getPhoto() {
        return photo;
    }

    public void setPhoto(MultipartFile photo) {
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

    public String getBrandId() {
        return brand;
    }

    public void setBrandId(String brand) {
        this.brand = brand;
    }


}
