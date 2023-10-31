package com.jorzon.Parcial.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {

    @GetMapping("/")
    public String saludar(){
        return " :0 Aqui va el texto que quiera mostrar";
    }

    @GetMapping("/about")
    public String presentar(){
        return "Aqui va la presentacion del creador :) ";
    }
}
