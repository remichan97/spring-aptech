package com.aptech.lab1.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aptech.lab1.model.Book;
import com.aptech.lab1.repository.BookRepository;

@Component
public class BookController {
    @Autowired
    private BookRepository repo;

    public void addNew(Scanner in) {
        System.out.println("Nhap ma ISBN sach:");
        String isbn = in.nextLine();
        System.out.println("Nhap ten sach:");
        String name = in.nextLine();
        System.out.println("Nhap tac gia sach:");
        String author = in.nextLine();
        System.out.println("Nhap gia sach:");
        float price = in.nextFloat();

        Book book = new Book(isbn, name, author, price);

        repo.addNew(book);
    }

    public void findAll() {
        List<Book> bookList = repo.findAll();
        bookList.forEach(System.out::println);
    }
}
