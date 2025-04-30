package com.java10x.CadastroDeNinja.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // add
    @PostMapping("/add")
    public NinjaDTO add(@RequestBody NinjaDTO ninjaDTO) {
        return ninjaService.add(ninjaDTO);
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
