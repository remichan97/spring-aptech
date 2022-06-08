package com.aptech.lab1.model;

public class Book {
    private String isbn;
    private String name;
    private String author;
    private float price;
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", isbn=" + isbn + ", name=" + name + ", price=" + price + "]";
    }

    public Book(String isbn, String name, String author, float price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    
}
