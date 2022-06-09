package com.aptech.lab2;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aptech.lab2.model.SinhVien;
import com.aptech.lab2.repository.SinhVienRepo;

@SpringBootApplication
public class Lab2Application implements CommandLineRunner{
	@Autowired
	private SinhVienRepo repo;

	private int menu(Scanner inp) {
		int opt = 0;
		try {
			System.out.println("1.Danh sach sinh vien");
			System.out.println("2.Them sinh vien");
			System.out.println("3.Sua thong tin");
			System.out.println("4.Xoa");
			System.out.println("5.Thoat");
			opt = Integer.parseInt(inp.nextLine());
		} catch (Exception e) {
			System.out.println("Khong hop le, moi chon lai");
		}
		return opt;
	}

	private void listAll() {
		List<SinhVien> sinhViens = repo.findAll();
		sinhViens.forEach(System.out::println);
	}

	private void addNew(Scanner inp) {
		System.out.println("Ma sinh vien:");
		String maSV = inp.nextLine();
		System.out.println("Ten sinh vien:");
		String tenSV = inp.nextLine();
		System.out.println("Lop hoc sinh vien:");
		String lopHoc = inp.nextLine();

		SinhVien sinhVien = new SinhVien(maSV, tenSV, lopHoc);
		repo.save(sinhVien);
	}

	private void update(Scanner inp) {
		System.out.println("Ma sinh vien:");
		String maSV = inp.nextLine();

		Optional<SinhVien> optional = repo.findById(maSV);

		if (optional.isPresent()) {
			System.out.println("Tim thay sinh vien, moi cap nhat thong tin:");
			SinhVien sv = optional.get();
			System.out.println("Ten sinh vien moi:");
			sv.setTenSV(inp.nextLine());
			System.out.println("Lop hoc sinh vien moi:");
			sv.setLopHoc(inp.nextLine());
			repo.save(sv);
		} else {
			System.out.println("Khong tim thay");
		}
	}

	private void delete(Scanner inp) {
		System.out.println("Ma sinh vien:");
		String maSV = inp.nextLine();

		Optional<SinhVien> optional = repo.findById(maSV);

		if (optional.isPresent()) {
			repo.deleteById(maSV);
			System.out.println("Tim thay sinh vien, da xoa thanh cong");
		} else {
			System.out.println("Khong tim thay");
		}
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner inp = new Scanner(System.in);
		while (true) {
			int opt = menu(inp);
			switch (opt) {
				case 1:
					listAll();
					break;
				case 2:
					addNew(inp);
					break;
				case 3:
					update(inp);
					break;
				case 4:
					delete(inp);
					break;
				case 5:
					System.exit(0);
					break;
			}
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(Lab2Application.class, args);
	}

}
