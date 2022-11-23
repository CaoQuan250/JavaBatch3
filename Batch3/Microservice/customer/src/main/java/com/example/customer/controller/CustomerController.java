package com.example.customer.controller;


import com.example.customer.model.Customer;
import com.example.customer.request.CustomerRegistrationRequest;
import com.example.customer.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
public record CustomerController(CustomerService customerService) {

    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistration){
        log.info("new customer registration {}", customerRegistration);
        customerService.registerCustomer(customerRegistration);

    }
}
