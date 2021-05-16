package com.example.JavaFullStack15Feb.onetomany.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String name;
    private String author;

    @OneToMany(mappedBy = "books")
    private Set<Pages> pages;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Set<Pages> getPages() {
        return pages;
    }

    public void setPages(Set<Pages> pages) {
        this.pages = pages;
    }
}
