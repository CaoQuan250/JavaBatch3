package com.example.stringboot.CarRental.Rep;


import com.example.stringboot.CarRental.Model.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceRep extends JpaRepository<Insurance,Long> {
}
