package com.example.JavaFullStack15Feb.onetomany.controller;

import com.example.JavaFullStack15Feb.onetomany.domain.Books;
import com.example.JavaFullStack15Feb.onetomany.domain.Pages;
import com.example.JavaFullStack15Feb.onetomany.repository.BooksRepo;
import com.example.JavaFullStack15Feb.onetomany.repository.PagesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class BooksController {
    @Autowired
    private BooksRepo booksRepo;
    @Autowired
    private PagesRepo pagesRepo;

    @GetMapping(value = "saveBooks")
    public String saveBooks() {
        Books books = new Books();
        Set<Pages> pages = new HashSet<>();

        Pages pages1 = new Pages();
        Pages pages2 = new Pages();

        books.setName("Java Book");
        books.setAuthor("James");

        pages1.setNumber(100);
        pages1.setChapter("Introduction");
        pages1.setBooks(books);
        pages2.setNumber(200);
        pages2.setChapter("Java OOP");
        pages2.setBooks(books);

        books.setPages(pages);
        booksRepo.save(books);
        booksRepo.save(pages1);
        booksRepo.save(pages2);

        return "Data saved.";
    }

    @GetMapping(value = "getBooks")
    public List<Books> getBooks() {
        return booksRepo.findAll();
    }

}
