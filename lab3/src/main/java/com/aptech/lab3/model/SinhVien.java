package com.aptech.lab3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
    private String roll;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "class_name")
    private String className;

}