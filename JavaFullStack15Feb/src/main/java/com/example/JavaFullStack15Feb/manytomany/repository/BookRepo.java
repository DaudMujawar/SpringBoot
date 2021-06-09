package com.example.JavaFullStack15Feb.manytomany.repository;

import com.example.JavaFullStack15Feb.manytomany.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {
}
