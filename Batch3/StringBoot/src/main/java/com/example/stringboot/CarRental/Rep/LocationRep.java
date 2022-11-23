package com.example.stringboot.CarRental.Rep;

import com.example.stringboot.CarRental.Model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRep extends JpaRepository<Location,Long> {
}
