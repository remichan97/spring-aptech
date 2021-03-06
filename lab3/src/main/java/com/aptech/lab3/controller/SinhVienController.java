package com.aptech.lab3.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("sv", new SinhVien());
        return "add";
    }

    @GetMapping("/update")
    public String updateData(@RequestParam(name = "roll") String roll, Model model) {
        SinhVien sinhVien = repo.findById(roll).get();
        model.addAttribute("sv", sinhVien);
        return "update";
    }

    @PostMapping("/AddStudent")
    public String addStudent(@ModelAttribute(name = "sv") @Valid SinhVien sv, BindingResult err, Model model) {
        if (err.hasErrors()) {
            return "add";
        }

        Optional<SinhVien> opt = repo.findById(sv.getRoll());

        if (opt.isPresent()) {
            model.addAttribute("error", "Roll number " + sv.getRoll() + " already exists.");
            return "add";
        }

        repo.save(sv);
        return "redirect:/";
    }

    @PostMapping("/UpdateStudent")
    public String updateStudent(@ModelAttribute(name = "sv") @Valid SinhVien sv, BindingResult err) {
        if (err.hasErrors()) {
            return "update";
        }

        repo.save(sv);
        return "redirect:/";
    }
}
