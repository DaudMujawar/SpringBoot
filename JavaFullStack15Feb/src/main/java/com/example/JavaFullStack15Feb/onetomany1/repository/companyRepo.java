package com.example.JavaFullStack15Feb.onetomany1.repository;

import com.example.JavaFullStack15Feb.onetomany1.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface companyRepo extends JpaRepository<Company,Integer> {
}
