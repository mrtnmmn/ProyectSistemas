package com.herokuSistemasMrtnmmn.ej02.controllers;

import com.herokuSistemasMrtnmmn.ej02.services.ContarVYC;
import com.herokuSistemasMrtnmmn.ej02.services.TraducirService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccionesController {

    @Autowired
    ContarVYC contar;
    
    @GetMapping("/contar/{texto}")
    public String contar(@PathVariable String texto) {
        String resultado = ContarVYC.contar(texto);
        return resultado;
    }
}