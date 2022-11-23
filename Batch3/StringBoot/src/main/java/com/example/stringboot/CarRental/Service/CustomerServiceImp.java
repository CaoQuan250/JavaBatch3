package com.example.stringboot.CarRental.Service;

import com.example.stringboot.CarRental.Model.Customer;
import com.example.stringboot.CarRental.Rep.CustomerRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImp implements CustomerService{

    @Autowired
    CustomerRep customerRep;

    @Override
    public void saveCustomer(Customer customer) {
        customerRep.save(customer);
    }

    @Override
    public List<Customer> saveAll(List<Customer> entities) {
        return (List<Customer>) customerRep.saveAll(entities);
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRep.findById(id);
    }

    @Override
    public Customer getOne(Long id) {
        return customerRep.findById(id).get();
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public List<Customer> findAllById(List<Long> ids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Customer entity) {

    }

    @Override
    public void deleteAll(List<Customer> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
