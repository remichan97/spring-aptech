package com.aptech.lab1;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aptech.lab1.controller.BookController;

@SpringBootApplication
public class Lab1Application implements CommandLineRunner {
	@Autowired
	private BookController controller;

	@Override
	public void run(String... args) throws Exception {
		Scanner in = new Scanner(System.in);
		controller.addNew(in);

		System.out.println("==========================");

		controller.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}
}
