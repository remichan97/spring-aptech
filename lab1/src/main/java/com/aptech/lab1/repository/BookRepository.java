package com.aptech.lab1.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.aptech.lab1.model.Book;

@Component
public class BookRepository {
    private List<Book> book = new ArrayList<>();

    public void addNew(Book bk) {
        System.out.println("Added book: " + bk);
        book.add(bk);
    }

    public List<Book> findAll() {
        return book;
    }
}
