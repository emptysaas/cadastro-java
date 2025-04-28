package com.java10x.CadastroDeNinja.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // CRUD

    @PostMapping("/add")
    public String add() { return "Add"; }

    @GetMapping("/view")
    public List<NinjaModel> ninjaModels(){
        return ninjaService.read();
    }

    @GetMapping("/viewID")
    public String readID() { return "viewID"; }

    @PutMapping("/update")
    public String update() { return "update"; }

    @DeleteMapping("/delete")
    public String delete() { return "delete"; }
}
