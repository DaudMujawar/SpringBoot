package com.example.JavaFullStack15Feb.onetoone.controller;

import com.example.JavaFullStack15Feb.onetoone.domain.Address;
import com.example.JavaFullStack15Feb.onetoone.domain.Users;
import com.example.JavaFullStack15Feb.onetoone.repository.AddressRepo;
import com.example.JavaFullStack15Feb.onetoone.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "saveUser")

    public String saveUser() {
        Users users = new Users();
        users.setName("Khalil");
        users.setEmail("def@gmail.com");

        Address address = new Address();
        address.setStreet("xyz");
        address.setDistrict("Sangli");
        address.setState("MH");

        users.setAddress(address);
        address.setUsers(users);
        userRepo.save(users);
        addressRepo.save(address);

        return "Record saved.";
    }

    @GetMapping(value = "getUsers")
    public ResponseEntity<?> getUsers() {
        List<Users> list = userRepo.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
