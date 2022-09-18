package com.dev.backend.service;

import com.dev.backend.entity.Aposta;
import com.dev.backend.entity.Cidade;
import com.dev.backend.repository.ApostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ApostaService {

    @Autowired
    ApostaRepository apostaRepository;

   /* public Aposta inserir(Aposta aposta){
        ArrayList<Integer> dezenas = new ArrayList();
        dezenas.add(2);
        dezenas.add(4);
        dezenas.add(3);
        dezenas.add(7);
        aposta.setNome("Carlos");
        aposta.setNumeroDaAposta(230);
        aposta.setDezenas(dezenas);
        Aposta apostaNova =apostaRepository.saveAndFlush(aposta);
        return aposta;
    }*/

    public List<Aposta> buscarTodos(){
        return apostaRepository.findAll();
    }

    public Aposta inserir(Aposta aposta){
        Aposta apostaNova = apostaRepository.saveAndFlush(aposta);
        return apostaNova;
    }
 }
