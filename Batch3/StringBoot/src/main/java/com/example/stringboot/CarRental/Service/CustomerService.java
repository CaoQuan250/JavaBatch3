package com.example.stringboot.CarRental.Service;

import com.example.stringboot.CarRental.Model.Customer;

import java.util.List;
import java.util.Optional;


public interface CustomerService {

    void saveCustomer(Customer customer);

    List<Customer> saveAll(List<Customer> entities);

    Optional<Customer> findById(Long id);

    Customer getOne(Long id);

    boolean existsById(Long id);

    List<Customer> findAll();

    List<Customer> findAllById(List<Long> ids);

    long count();

    void deleteById(Long id);

    void delete(Customer entity);

    void deleteAll(List<Customer> entities);

    void deleteAll();
}
