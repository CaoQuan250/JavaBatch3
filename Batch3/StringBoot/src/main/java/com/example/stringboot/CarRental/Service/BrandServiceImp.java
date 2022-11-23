package com.example.stringboot.CarRental.Service;

import com.example.stringboot.CarRental.Model.Brand;
import com.example.stringboot.CarRental.Rep.BrandRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BrandServiceImp implements BrandService{
    @Autowired
    BrandRep brandRep;

    @Override
    public Brand save(Brand entity){
        return brandRep.save(entity);
    }

    @Override
    public List<Brand> saveAll(List<Brand> entities){
        return (List<Brand>) brandRep.saveAll(entities);
    }

    @Override
    public Optional<Brand> findById(String id){
        return brandRep.findById(id);
    }

    @Override
    public boolean existsById(String id){
        return brandRep.existsById(id);
    }

    @Override
    public List<Brand> findAll(){
        return (List<Brand>) brandRep.findAll();
    }

    @Override
    public List<Brand> findAllById(List<String> ids){
        return (List<Brand>) brandRep.findAllById(ids);
    }

    @Override
    public long count(){
        return brandRep.count();
    }

    @Override
    public void deleteById(String id){
        brandRep.deleteById(id);
    }

    @Override
    public void delete(Brand entity){
        brandRep.delete(entity);
    }

    @Override
    public void deleteAll(List<Brand> entities){
        brandRep.deleteAll(entities);
    }

    @Override
    public void deleteAll(){
        brandRep.deleteAll();
    }

}
