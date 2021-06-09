package com.example.JavaFullStack15Feb.manytomany.domain;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Entity
public class Book {
    String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;


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

    public Set<Publisher> getPublishers() {
        return publishers;
    }

    public void setPublishers(Set<Publisher> publishers) {
        this.publishers = publishers;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "book_publisher",joinColumns = @JoinColumn(name = "book_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "publisher_id",referencedColumnName = "id"))
    private Set<Publisher> publishers;


    public Book(String name,Publisher...publishers){//varags
        this.name=name;
        this.publishers= Stream.of(publishers).collect(Collectors.toSet());
        this.publishers.forEach(x->x.getBooks().add(this));
    }
    public Book(){

    }

}
