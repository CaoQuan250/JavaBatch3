package com.example.stringboot.CarRental.Service;

import com.example.stringboot.CarRental.Model.Roles;

import java.util.Optional;

public interface RoleService {
    Optional<Roles> findByName(String name);
}
