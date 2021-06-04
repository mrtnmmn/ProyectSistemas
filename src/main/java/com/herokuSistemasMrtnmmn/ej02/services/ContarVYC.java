package com.herokuSistemasMrtnmmn.ej02.services;

import org.springframework.stereotype.Service;

@Service
public class ContarVYC {
    
    public static String contar(String texto) {
        
        String auxText = texto.toLowerCase();
        String finalText = "";
        int l = texto.length();

        int contVocales = 0, contConsonantes = 0;
        
        for (int i = 0; i < l; i++ ) {
            if (comprobacionVocal(auxText.charAt(i))) {
                contVocales++ ;
            }
            else {
                contConsonantes++ ;
            }
        }

        finalText = "Vocales: " + contVocales + "\nConsonantes: " + contConsonantes;

        return finalText;
    }

    public static boolean comprobacionVocal(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        else{
            return false;
        } 
    } 

    
}
