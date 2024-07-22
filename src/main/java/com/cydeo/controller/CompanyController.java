package com.cydeo.controller;


import com.cydeo.service.CompanyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/companies/list")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public String listAllCompanies(Model model){
        model.addAttribute("companies",companyService.listAllCompanies());
        return "/company/company-list";

    }
}
