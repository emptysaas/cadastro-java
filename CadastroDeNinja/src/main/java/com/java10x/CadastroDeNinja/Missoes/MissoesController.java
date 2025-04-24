package com.java10x.CadastroDeNinja.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissoesController {

    @GetMapping(name = "/missoes")
    public String missoes(){
        return  "Olá";
    }

}
