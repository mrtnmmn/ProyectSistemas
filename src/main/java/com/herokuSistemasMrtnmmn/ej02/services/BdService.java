package com.herokuSistemasMrtnmmn.ej02.services;

import com.herokuSistemasMrtnmmn.ej02.models.DatosModel;
import com.herokuSistemasMrtnmmn.ej02.repositories.DatosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BdService {
    
    @Autowired
    DatosRepository entornosRepository;

    public void guardarDatos(DatosModel modeloDatos){
        entornosRepository.save(modeloDatos);
    }

    public ArrayList<DatosModel> devuelveDatos(){
        return (ArrayList<DatosModel>) entornosRepository.findAll();
    }

}
