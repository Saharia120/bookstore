package com.bookstore.bookstore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private double price;
    private String category;
    private int stock;
    private String description;
    private String image;

    public Book() {}

    public Book(String title, String author, double price, String category, int stock, String description, String image) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
        this.stock = stock;
        this.description = description;
        this.image = image;
    }

    // Getters & setters omitted for brevity (use your current ones)
}