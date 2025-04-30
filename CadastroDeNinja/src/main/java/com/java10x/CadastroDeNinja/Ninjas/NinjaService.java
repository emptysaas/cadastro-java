package com.java10x.CadastroDeNinja.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    // add - Criar
    public NinjaDTO add(NinjaDTO ninjaDTO){
        NinjaModel model = ninjaMapper.map(ninjaDTO);
        model = ninjaRepository.save(model);
        return ninjaMapper.map(model);
    }

    // read - ver - ler
    public List<NinjaDTO> read() {
        List<NinjaModel> model = ninjaRepository.findAll();
        return model.stream().map(ninjaMapper::map).collect(Collectors.toList());
    }

    // viewID - ver - ler -> ID
    public NinjaDTO readID(Long identificador) {
        Optional<NinjaModel> readID = ninjaRepository.findById(identificador);
        return readID.map(ninjaMapper::map).orElse(null);
    }


    // put - upar - atualizar - update
    public NinjaDTO update(Long identificador, NinjaDTO ninjaDTO) {
        Optional<NinjaModel> upID = ninjaRepository.findById(identificador);
        if (upID.isPresent()) {
            NinjaModel putId = ninjaMapper.map(ninjaDTO);
            putId.setIdentificador(identificador);
            NinjaModel putSave = ninjaRepository.save(putId);
            return ninjaMapper.map(putSave);
        }
        return null;
    }


    // delete - remover - deletar
    public void delete(Long identificador){
        ninjaRepository.deleteById(identificador);
    }

}
