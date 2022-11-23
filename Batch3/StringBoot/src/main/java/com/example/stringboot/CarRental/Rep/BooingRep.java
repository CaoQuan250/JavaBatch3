package com.example.stringboot.CarRental.Rep;

import com.example.stringboot.CarRental.Model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooingRep extends JpaRepository<Booking,Long> {
}
