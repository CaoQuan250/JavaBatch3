package com.example.stringboot.CarRental.Rep;

import com.example.stringboot.CarRental.Model.Deposit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepositRep extends JpaRepository<Deposit,Long> {
}
