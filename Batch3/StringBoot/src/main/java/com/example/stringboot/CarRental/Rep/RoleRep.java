package com.example.stringboot.CarRental.Rep;


import com.example.stringboot.CarRental.Model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRep extends JpaRepository<Roles,Long> {

    Optional<Roles> findByName(String name);

}
