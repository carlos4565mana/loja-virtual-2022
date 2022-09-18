package com.dev.backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;


@Entity
@Table(name = "tb_aposta")
@Data
public class Aposta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private Integer numeroDaAposta;
    private ArrayList<Integer> dezenas;
}
