package com.herokuSistemasMrtnmmn.ej02.controllers;

import com.herokuSistemasMrtnmmn.ej02.models.DatosModel;
import com.herokuSistemasMrtnmmn.ej02.services.BdService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaveBD {
    
    @Autowired
    BdService bdService;
  
    @GetMapping("/addDatos/{dato}")
    public String addDatos(@PathVariable String dato) {
      DatosModel datosModel = new DatosModel();
      datosModel.setDato(dato);
      bdService.guardarDatos(datosModel);
      return datosModel.toString();
    }

    @GetMapping("/getDatos")
    public String getDatos() {
        return bdService.devuelveDatos().toString();
    }
}
