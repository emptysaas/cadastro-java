package com.java10x.CadastroDeNinja.NinjaController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/usuario")
    public String mensagem(){
        return "Olá usuário !!";
    }
}
