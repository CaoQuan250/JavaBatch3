package com.example.stringboot.CarRental.Service;

import com.example.stringboot.CarRental.Model.Users;
import com.example.stringboot.CarRental.Rep.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    UserRep userRep;

    @Override
    public Users findByUsername(String username) {
        return userRep.findByUsername(username);
    }

    @Override
    public Boolean existsByUsername(String username) {
        return userRep.existsByUsername(username);
    }

    @Override
    public void saveUser(Users users) {
        userRep.save(users);
    }

}
