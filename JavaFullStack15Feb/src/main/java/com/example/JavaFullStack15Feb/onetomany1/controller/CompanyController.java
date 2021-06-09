package com.example.JavaFullStack15Feb.onetomany1.controller;

import com.example.JavaFullStack15Feb.onetomany1.domain.Company;
import com.example.JavaFullStack15Feb.onetomany1.domain.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    private com.example.JavaFullStack15Feb.onetomany1.repository.companyRepo companyRepo;

    @Autowired
    private com.example.JavaFullStack15Feb.onetomany1.repository.employeesRepo employeesRepo;

    @GetMapping(value = "saveComp")
    public String saveComp(){
        Company company=new Company();
        List<Employees> employees=new ArrayList<>();

        Employees employees1=new Employees();
        Employees employees2=new Employees();

        company.setCompname("TCS");

        employees1.setName("Rahul");
        employees1.setEmail("abc@gmail.com");
        employees1.setCompany(company);
        employees2.setName("Suraj");
        employees2.setEmail("xyz@gmail.com");
        employees2.setCompany(company);

        company.setEmployees(employees);
        companyRepo.save(company);
        employeesRepo.save(employees1);
        employeesRepo.save(employees2);

        return "Data saved.";
    }

    @GetMapping(value = "getComp")
    public List<Company> getComp(){
        return companyRepo.findAll();
    }
}
