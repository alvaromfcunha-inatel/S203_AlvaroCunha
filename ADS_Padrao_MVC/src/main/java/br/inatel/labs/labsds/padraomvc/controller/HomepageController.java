package br.inatel.labs.labsds.padraomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController  {
    @GetMapping("/homepage")
    public String getPage(Model model) {
        model.addAttribute("user", "Alvaro");
        return "homepage";
    }
}
