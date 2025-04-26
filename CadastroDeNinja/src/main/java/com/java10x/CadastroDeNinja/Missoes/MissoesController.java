package com.java10x.CadastroDeNinja.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    // CRUD

    @PostMapping("/add")
    public String add() { return "Add"; }

    @GetMapping("/view")
    public String read() { return "Read"; }

    @GetMapping("/viewID")
    public String readID() { return "viewID"; }

    @PutMapping("/update")
    public String update() { return "update"; }

    @DeleteMapping("/delete")
    public String delete() { return "delete"; }

}
