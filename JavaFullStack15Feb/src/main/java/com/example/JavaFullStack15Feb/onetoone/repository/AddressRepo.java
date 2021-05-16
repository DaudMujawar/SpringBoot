package com.example.JavaFullStack15Feb.onetoone.repository;

import com.example.JavaFullStack15Feb.onetoone.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Long> {
}
