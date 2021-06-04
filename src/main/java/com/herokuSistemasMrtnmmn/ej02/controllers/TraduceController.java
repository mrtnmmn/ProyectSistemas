package com.herokuSistemasMrtnmmn.ej02.controllers;

import com.herokuSistemasMrtnmmn.ej02.services.ContarVYC;
import com.herokuSistemasMrtnmmn.ej02.services.TraducirService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class TraduceController {
    @Autowired
    TraducirService traducirService;

    @RequestMapping("/traduce/{frase}")
    public  String traduce(@PathVariable String frase, Model modelo){
        String translatedText= traducirService.getTraduccion(frase);
        modelo.addAttribute("frase", frase);
        modelo.addAttribute("translatedText", translatedText);
        return "traduccion";
    }
}