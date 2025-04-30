package com.java10x.CadastroDeNinja.Ninjas;

import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

    public NinjaModel map(NinjaDTO ninjaDTO) {
        NinjaModel ninjaModel = new NinjaModel();
        ninjaModel.setIdentificador(ninjaDTO.getIdentificador());
        ninjaModel.setAge(ninjaDTO.getAge());
        ninjaModel.setMail(ninjaDTO.getMail());
        ninjaModel.setName(ninjaDTO.getName());
        ninjaModel.setUsername(ninjaDTO.getUsername());
        ninjaModel.setRank(ninjaDTO.getRank());
        ninjaModel.setSex(ninjaDTO.getSex());
        ninjaModel.setMissoes(ninjaDTO.getMissoes());
        return ninjaModel;
    }

    public NinjaDTO map(NinjaModel ninjaModel) {
        NinjaDTO ninjaDTO = new NinjaDTO();
        ninjaDTO.setIdentificador(ninjaModel.getIdentificador());
        ninjaDTO.setAge(ninjaModel.getAge());
        ninjaDTO.setMail(ninjaModel.getMail());
        ninjaDTO.setName(ninjaModel.getName());
        ninjaDTO.setUsername(ninjaModel.getUsername());
        ninjaDTO.setRank(ninjaModel.getRank());
        ninjaDTO.setSex(ninjaModel.getSex());
        ninjaDTO.setMissoes(ninjaModel.getMissoes());
        return ninjaDTO;
    }
}
