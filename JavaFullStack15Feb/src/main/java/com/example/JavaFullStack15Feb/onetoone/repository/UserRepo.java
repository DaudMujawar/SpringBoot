package com.example.JavaFullStack15Feb.onetoone.repository;

import com.example.JavaFullStack15Feb.onetoone.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Long> {
}
