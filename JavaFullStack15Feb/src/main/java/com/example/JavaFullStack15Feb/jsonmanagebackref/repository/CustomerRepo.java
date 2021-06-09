package com.example.JavaFullStack15Feb.jsonmanagebackref.repository;

import com.example.JavaFullStack15Feb.jsonmanagebackref.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {

}
