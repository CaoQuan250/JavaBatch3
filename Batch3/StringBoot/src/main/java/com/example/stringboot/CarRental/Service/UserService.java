package com.example.stringboot.CarRental.Service;

import com.example.stringboot.CarRental.Model.Users;
import org.springframework.beans.factory.ObjectProvider;

import java.util.Optional;

public interface UserService {

    Users findByUsername(String username);
    Boolean existsByUsername(String username);
    void saveUser(Users users);



}
