package com.example.stringboot.CarRental.Service;

import com.example.stringboot.CarRental.Model.Roles;
import com.example.stringboot.CarRental.Rep.RoleRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImp implements RoleService {

    @Autowired
    RoleRep roleRep;
    @Override
    public Optional<Roles> findByName(String name) {
        return roleRep.findByName(name);
    }
}
