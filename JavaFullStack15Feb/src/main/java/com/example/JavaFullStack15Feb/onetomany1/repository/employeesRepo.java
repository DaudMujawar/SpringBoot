package com.example.JavaFullStack15Feb.onetomany1.repository;

import com.example.JavaFullStack15Feb.onetomany1.domain.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeesRepo extends JpaRepository<Employees,Integer> {
}
