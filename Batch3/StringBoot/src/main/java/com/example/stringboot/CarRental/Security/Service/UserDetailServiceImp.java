package com.example.stringboot.CarRental.Security.Service;

import com.example.stringboot.CarRental.Model.Users;
import com.example.stringboot.CarRental.Rep.RoleRep;
import com.example.stringboot.CarRental.Rep.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserDetailServiceImp implements UserDetailsService {
    @Autowired
    UserRep userRep;

    @Autowired
    RoleRep roleRep;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRep.findByUsername(username);
        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
        if(user == null){
            new UsernameNotFoundException("Login fail");
        }else {
            List<GrantedAuthority> authorities = user.getRoles().stream()

                    .map(role -> new SimpleGrantedAuthority(role.getName()))
                    .collect(Collectors.toList());

            UserDetails userDetails = new org.springframework.security.core.userdetails.User(username,
                    user.getPassword(),authorities);
            return userDetails;
        }

        return UserDetailImp.build(user);
    }

}
