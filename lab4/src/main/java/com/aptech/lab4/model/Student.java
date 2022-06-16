package com.aptech.lab4.model;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class Student {
	@NotBlank(message = "Roll number cannot be blank")
	private String roll;
	@NotBlank(message = "Student name cannot be blank")
	private String name;
	@NotBlank(message = "Address cannot be blank")
	private String address;
}
