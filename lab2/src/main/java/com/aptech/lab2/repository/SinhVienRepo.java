package com.aptech.lab2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aptech.lab2.model.SinhVien;

@Repository
public interface SinhVienRepo extends JpaRepository<SinhVien, String>{
    
}
