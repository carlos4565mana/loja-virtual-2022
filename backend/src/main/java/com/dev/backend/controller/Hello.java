package com.dev.backend.controller;

import com.dev.backend.entity.Aposta;
import com.dev.backend.entity.Cidade;
import com.dev.backend.entity.Estado;
import com.dev.backend.repository.ApostaRepository;
import com.dev.backend.service.ApostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/aposta")
public class Hello {
    @Autowired
    ApostaService apostaService;

 /*   @GetMapping("/aposta")
    public Aposta inserir(){

        ApostaRepository apostaRepository;
        ArrayList<Integer> dezenas = new ArrayList();
        Aposta aposta = new Aposta();
        dezenas.add(2);
        dezenas.add(4);
        dezenas.add(3);
        dezenas.add(7);
        aposta.setNome("Carlos");
        aposta.setNumeroDaAposta(230);
        aposta.setDezenas(dezenas);

        return aposta;
    }*/

    @GetMapping("/")
    public List<Aposta> buscarTodos(){
        return apostaService.buscarTodos();
    }

    @PostMapping("/")
    public Aposta inserir(@RequestBody Aposta aposta){
        return apostaService.inserir(aposta);
    }



    public String hello(){
        return "Hello Word Spring  " + new Date();
    }

}





