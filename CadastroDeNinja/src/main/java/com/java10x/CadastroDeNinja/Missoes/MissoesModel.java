package com.java10x.CadastroDeNinja.Missoes;

import com.java10x.CadastroDeNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public abstract class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long identificador;

    private String missao;
    private String dificuldade;

    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninja;
}
