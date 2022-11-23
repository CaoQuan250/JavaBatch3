package com.example.stringboot.CarRental.Rep;

import com.example.stringboot.CarRental.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRep extends JpaRepository<Customer,Long> {
}
