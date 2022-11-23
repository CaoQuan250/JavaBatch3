package com.example.stringboot.CarRental.Service;

import com.example.stringboot.CarRental.Dto.Filter;
import com.example.stringboot.CarRental.Model.Brand;
import com.example.stringboot.CarRental.Model.Car;
import com.example.stringboot.CarRental.Rep.BrandRep;
import com.example.stringboot.CarRental.Rep.CarRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImp implements CarService{
    @Autowired
    CarRep carRep;
    @Autowired
    BrandRep brandRep;
    @Override
    public List<Brand> findAllBrand(){
        return (List<Brand>) brandRep.findAll();
    }
    @Override
    public Car save(Car entity){
        return carRep.save(entity);
    }
    @Override
    public List<Car> saveAll(List<Car> entities){
        return (List<Car>) carRep.saveAll(entities);
    }
    @Override
    public Optional<Car> findById(String id){
        return carRep.findById(id);
    }
    @Override
    public boolean existsById(String id){
        return carRep.existsById(id);
    }
    @Override
    public List<Car> findAll(){
        return (List<Car>) carRep.findAll();
    }

    @Override
    public List<Car> filter(String fuel, String model) {
        if (fuel != null && model != null) {
            return carRep.findByFuelAndModel(fuel, model);
        } else if (fuel != null && model == null) {
            return carRep.findByFuel(fuel);
        } else if (fuel == null && model != null) {
            return carRep.findByModel(model);
        }
        return carRep.findAll();
    }


    @Override
    public List<Car> findAllById(List<String> ids){
        return (List<Car>) carRep.findAllById(ids);
    }
    @Override
    public long count(){
        return carRep.count();
    }
    @Override
    public void deleteById(String id){
        carRep.deleteById(id);
    }
    @Override
    public void delete(Car entity){
        carRep.delete(entity);
    }
    @Override
    public void deleteAll(List<Car> entities){
        carRep.deleteAll(entities);
    }
    @Override
    public void deleteAll(){
        carRep.deleteAll();
    }


}
