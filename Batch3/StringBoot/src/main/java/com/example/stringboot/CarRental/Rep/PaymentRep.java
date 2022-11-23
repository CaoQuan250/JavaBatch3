package com.example.stringboot.CarRental.Rep;


import com.example.stringboot.CarRental.Model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRep extends JpaRepository<Payment,Long> {
}
