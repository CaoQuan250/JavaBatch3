package com.example.stringboot.CarRental.Rep;

import com.example.stringboot.CarRental.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRep extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);



}
