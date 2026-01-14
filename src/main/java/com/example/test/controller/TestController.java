package com.example.test.controller;

import com.example.test.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class TestController {
    private final CustomerService customerService;

    @GetMapping
    public String getCustomers(Model model) {
        model.addAttribute("customers", customerService.getCustomers());
        return "index";
    }
}
