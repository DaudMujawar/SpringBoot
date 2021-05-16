package com.example.JavaFullStack15Feb.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByName(String name);

    @Query(value = "select * from employee where name like %:name%", nativeQuery = true)
    List<Employee> findByNameLikeDemo(String name);

    List<Employee> findByNameStartingWith(String name);

    List<Employee> findByNameAndAddress(String name, String address);
}
