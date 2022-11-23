package com.example.customer.service;

import com.example.customer.model.Customer;
import com.example.customer.request.CustomerRegistrationRequest;

public record CustomerService() {
    public void registerCustomer(CustomerRegistrationRequest customerRegistration) {
        Customer customer = Customer.builder()
                .firstName(customerRegistration.firstName())
                .lastName(customerRegistration.lastName())
                .email(customerRegistration.email())
                .build();
    }
}
