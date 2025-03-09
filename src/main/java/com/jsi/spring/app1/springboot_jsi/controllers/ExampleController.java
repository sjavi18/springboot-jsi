package com.jsi.spring.app1.springboot_jsi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {
    @GetMapping("detalles_info")

    public String info(Model model) {
        model.addAttribute("Titulo", "Servidor en linea");
        model.addAttribute("Nombre", "Javier SS");
        model.addAttribute("Ip", "129.34.5.7");
        return "detalles_info";
    }
}
