package com.example.JavaFullStack15Feb.onetomany.repository;

import com.example.JavaFullStack15Feb.onetomany.domain.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepo extends JpaRepository<Books,Integer> {
}
