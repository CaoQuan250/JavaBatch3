package com.example.stringboot.CarRental.Service;


import com.example.stringboot.CarRental.Model.Brand;

import java.util.List;
import java.util.Optional;

public interface BrandService {

    Brand save(Brand entity);

    List<Brand> saveAll(List<Brand> entities);

    Optional<Brand> findById(String id);

    boolean existsById(String id);

    List<Brand> findAll();

    List<Brand> findAllById(List<String> ids);

    long count();

    void deleteById(String id);

    void delete(Brand entity);

    void deleteAll(List<Brand> entities);

    void deleteAll();

}
