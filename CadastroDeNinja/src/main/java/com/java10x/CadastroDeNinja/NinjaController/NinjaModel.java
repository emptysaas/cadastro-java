package com.java10x.CadastroDeNinja.NinjaController;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public abstract class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long identificador;

    private String name;
    private String username;
    private String mail;
    private char sex;
    private short age;

    public NinjaModel() {
    }


}
