package com.aptech.lab3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "sinh_vien")
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SinhVien {

    @Id
    @Column(name = "roll_id")
    @NotBlank(message = "Roll # cannot be blank")
    private String roll;
    @Column(name = "full_name")
    @NotBlank(message = "Full name cannot be blank")
    private String fullName;
    @Column(name = "class_name")
    @NotBlank(message = "Class name cannot be blank")
    private String className;

}