package com.example.stringboot.CarRental.Rep;

import com.example.stringboot.CarRental.Model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRep extends JpaRepository<Brand,String> {
}