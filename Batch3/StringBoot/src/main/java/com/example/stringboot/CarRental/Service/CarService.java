package com.example.stringboot.CarRental.Service;

import com.example.stringboot.CarRental.Dto.Filter;
import com.example.stringboot.CarRental.Model.Brand;
import com.example.stringboot.CarRental.Model.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {
    List<Brand> findAllBrand();

    Car save(Car entity);

    List<Car> saveAll(List<Car> entities);

    Optional<Car> findById(String id);

    boolean existsById(String id);

    List<Car> findAll();

    List<Car> filter(String fuel, String model);

    List<Car> findAllById(List<String> ids);

    long count();

    void deleteById(String id);

    void delete(Car entity);

    void deleteAll(List<Car> entities);

    void deleteAll();

}
