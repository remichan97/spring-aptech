package com.aptech.lab3.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aptech.lab3.model.SinhVien;
import com.aptech.lab3.repo.SinhVienRepo;

@Controller
public class SinhVienController {
    @Autowired
    private SinhVienRepo repo;

    // all method must return a string of the jsp file name without the extension
    @GetMapping("/")
    public String home(Model model) {
        List<SinhVien> list = repo.findAll();
        model.addAttribute("sinhViens" ,list);

        return "index";
    }

    @GetMapping("/delete")
    @Transactional // whatever CUD action must have this
    public String delete(@RequestParam(name = "roll") String roll) {

        repo.deleteById(roll);

        //use this to redirect, NOT by using file name. This is for refreshing latest data from the database
        return "redirect:/";
    }
}
