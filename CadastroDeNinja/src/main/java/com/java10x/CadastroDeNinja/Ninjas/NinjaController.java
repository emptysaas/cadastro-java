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

    // read
    @GetMapping("/read")
    public List<NinjaDTO> ninjaModels(){
        return ninjaService.read();
    }

    // read
    @GetMapping("/readID/{identificador}")
    public NinjaDTO readID(@PathVariable Long identificador) {
        return  ninjaService.readID(identificador);
    }

    // put
    @PutMapping("/update/{identificador}")
    public NinjaDTO update(@PathVariable Long identificador, @RequestBody NinjaDTO putModel) {
        return ninjaService.update(identificador, putModel);
    }

    // delete
    @DeleteMapping("/delete/{identificador}")
    public void delete(@PathVariable Long identificador) {
        ninjaService.delete(identificador);
    }
}
