package com.bookStore.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

@Entity
@Table(name = "books")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private double price;

//    public Book (String title, String author, double price) {
//        this.title = title;
//        this.author = author;
//        this.price = price;
//    }

}
