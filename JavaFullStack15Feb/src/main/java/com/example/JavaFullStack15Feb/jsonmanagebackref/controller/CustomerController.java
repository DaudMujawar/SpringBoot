package com.example.JavaFullStack15Feb.jsonmanagebackref.controller;

import com.example.JavaFullStack15Feb.jsonmanagebackref.domain.Customer;
import com.example.JavaFullStack15Feb.jsonmanagebackref.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/customer")
public class CustomerController {

    @Autowired
    CustomerRepo customerRepo;

    @PostMapping(value = "/saveCustomer")
    public String saveCustomer(@RequestBody Customer customer) {
        customerRepo.save(customer);
        return "Customer saved successfully";
    }

    @GetMapping(value = "getCustomer")
    public List<Customer> getCustomer() {
        return customerRepo.findAll();
    }
}
