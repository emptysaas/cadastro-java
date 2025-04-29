package com.java10x.CadastroDeNinja.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }


    // add - Criar
    public NinjaModel add(NinjaModel model){
        return ninjaRepository.save(model);
    }

    // view - ver - ler
    public List<NinjaModel> read() {
        return ninjaRepository.findAll();
    }

    // viewID - ver - ler -> ID
    public NinjaModel readID(Long identificador) {
        Optional<NinjaModel> ninjaID = ninjaRepository.findById(identificador);
        return ninjaID.orElse(null);
    }


    // put - upar - atualizar - update
    public NinjaModel update(Long identificador, NinjaModel upModel){
        if (ninjaRepository.existsById(identificador)){
            upModel.setIdentificador(identificador);
            return ninjaRepository.save(upModel);
        }
        return null;

    }


    // delete - remover - deletar
    public void delete(Long identificador){
        ninjaRepository.deleteById(identificador);
        System.out.println("Deletado Com sucesso!");
    }

}
