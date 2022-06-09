package com.aptech.lab2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sinh_vien")
public class SinhVien {
    @Id
    @Column(name = "roll_id")
    private String maSV;

    @Column(name = "full_name")
    private String tenSV;
    
    @Column(name = "class_name")
    private String lopHoc;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    @Override
    public String toString() {
        return "SinhVien [lopHoc=" + lopHoc + ", maSV=" + maSV + ", tenSV=" + tenSV + "]";
    }

    public SinhVien(String maSV, String tenSV, String lopHoc) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lopHoc = lopHoc;
    }

    public SinhVien() {
    }

}
