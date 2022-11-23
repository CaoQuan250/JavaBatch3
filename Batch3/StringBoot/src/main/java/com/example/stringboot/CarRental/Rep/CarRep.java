package com.example.stringboot.CarRental.Rep;


import com.example.stringboot.CarRental.Dto.Filter;
import com.example.stringboot.CarRental.Model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRep extends JpaRepository<Car,String> {

    List<Car> findByFuelAndModel( String fuel, String model);

    List<Car> findByFuel(String fuel);

    List<Car> findByModel(String model);

}
