package com.example.JavaFullStack15Feb.spcall.controller;


import com.example.JavaFullStack15Feb.spcall.repository.SpCallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "api/")
public class SpCallController {
    @Autowired
    private SpCallRepository spCallRepository;

    @GetMapping(value = "getCustomerInfo")
    public ResponseEntity<?> getCust() {
        List<Map<String, String>> list = spCallRepository.getCustomerData();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
        @GetMapping(value = "innerJoin")
                public ResponseEntity<?> innerJoin(){
            List<Map<String,String>> list=spCallRepository.innerJoin();
            return new ResponseEntity<>(list,HttpStatus.OK);
    }
}
