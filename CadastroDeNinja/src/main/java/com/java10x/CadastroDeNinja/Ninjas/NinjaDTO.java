package com.java10x.CadastroDeNinja.Ninjas;

import com.java10x.CadastroDeNinja.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaDTO {

    private Long identificador;
    private String name;
    private String username;
    private String mail;
    private String sex;
    private int age;
    private String rank;
    private MissoesModel missoes;

}
