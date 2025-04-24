package com.java10x.CadastroDeNinja.Ninjas;

import com.java10x.CadastroDeNinja.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public abstract class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long identificador;

    private String name;
    private String username;
    private String mail;
    private char sex;
    private short age;

    // ligar tabelas
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;

}
