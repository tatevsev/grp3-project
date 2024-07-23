package com.cydeo.controller;

import com.cydeo.service.ClientVendorService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("clientVendor/list")
public class ClientVendorController {

    private final ClientVendorService clientVendorService;

    public ClientVendorController(ClientVendorService clientVendorService) {
        this.clientVendorService = clientVendorService;

    }
    @GetMapping
    public String listClientVendor(Model model){
        model.addAttribute("clientVendors",clientVendorService.listAllClientVendors());

        return "/clientVendor/clientVendor-list";
    }
}
