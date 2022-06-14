package com.aptech.lab3.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aptech.lab3.model.SinhVien;

public interface SinhVienRepo extends JpaRepository<SinhVien, String> {
    
}
