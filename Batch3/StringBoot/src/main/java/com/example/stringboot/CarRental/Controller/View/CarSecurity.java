package com.example.stringboot.CarRental.Controller.View;

import com.example.stringboot.CarRental.Common.Constants;
import com.example.stringboot.CarRental.Model.Customer;
import com.example.stringboot.CarRental.Model.Roles;
import com.example.stringboot.CarRental.Model.Users;
import com.example.stringboot.CarRental.Service.CustomerService;
import com.example.stringboot.CarRental.Service.RoleService;
import com.example.stringboot.CarRental.Service.UserService;
import com.example.stringboot.CarRental.payload.RegisterUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@Controller
public class CarSecurity {
    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;
    @Autowired
    PasswordEncoder encoder;
    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(Model model){
        return "login";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerPage(Model model){
        return "register";
    }

    @RequestMapping(value = "/registersubmit", method = RequestMethod.POST)
    public String registerSubmit(@ModelAttribute RegisterUser registerUser){
        if (userService.existsByUsername(registerUser.getUsername())){

        } else {
            Users users = new Users();
            Customer customer = new Customer();
            customerService.saveCustomer(customer);
            users.setUsername(registerUser.getUsername());
            String password = encoder.encode(registerUser.getPassword());
            users.setPassword(password);
            users.setEmail(registerUser.getEmail());

            Set<Roles> roles = new HashSet<Roles>();
            Roles r = roleService.findByName(Constants.ROLE_USER).get();
            roles.add(r);
            Customer findId = customerService.findById(customer.getId()).get();

            users.setCustomer(findId);
            users.setRoles(roles);
            userService.saveUser(users);

        }
        return "login";
    }

    @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
    public String logoutSuccessfulPage(Model model) {
        model.addAttribute("title","Logout");
        return "logoutSuccessful";
    }

    @GetMapping(value = {"/403"})
    public String showPermissionDenied(){
        return "403";
    }

}
