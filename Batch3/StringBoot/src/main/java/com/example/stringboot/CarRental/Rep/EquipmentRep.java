package com.example.stringboot.CarRental.Rep;


import com.example.stringboot.CarRental.Model.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentRep extends JpaRepository<Equipment,Long> {
}
