package com.example.JavaFullStack15Feb.onetomany.repository;

import com.example.JavaFullStack15Feb.onetomany.domain.Pages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagesRepo extends JpaRepository<Pages,Integer> {

}
