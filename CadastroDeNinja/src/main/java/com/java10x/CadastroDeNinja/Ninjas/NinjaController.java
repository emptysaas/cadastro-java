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

    // add
    @PostMapping("/add")
    public NinjaModel add(@RequestBody NinjaModel model) {
        return ninjaService.add(model);
    }

    // view
    @GetMapping("/view")
    public List<NinjaModel> ninjaModels(){
        return ninjaService.read();
    }

    // viewID
    @GetMapping("/viewID/{identificador}")
    public NinjaModel readID(@PathVariable Long identificador) {
        return  ninjaService.readID(identificador);
    }

    // put
    @PutMapping("/update/{identificador}")
    public NinjaModel update(@PathVariable Long identificador, @RequestBody NinjaModel upModel) {
        return ninjaService.update(identificador, upModel);
    }

    // delete
    @DeleteMapping("/delete/{identificador}")
    public void delete(@PathVariable Long identificador) {
        ninjaService.delete(identificador);
    }
}
