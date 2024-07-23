package com.cydeo.controller;


import com.cydeo.dto.CompanyDto;
import com.cydeo.service.CompanyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/companies")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/list")
    public String listAllCompanies(Model model){
        model.addAttribute("companies",companyService.listAllCompanies());
        return "/company/company-list";

    }

    @GetMapping("/create")

    public String createCompany(Model model){

        model.addAttribute("newCompany",new CompanyDto());

        return "/company/company-create";
    }

    @PostMapping("/create")

    public String insertCompany(@ModelAttribute("title") CompanyDto company,Model model){

        companyService.create(company);
        model.addAttribute("newCompany",new CompanyDto());

        return "redirect:/company/company-create";
    }





}
