package com.example.trabalho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.trabalho.entity.Trabalho;
import com.example.trabalho.repository.TrabalhoRepository;


@RestController
@CrossOrigin
@RequestMapping(value = "/trabalho")
public class TrabalhoController {

    @Autowired
    private TrabalhoRepository trabalhoRepository;

    @GetMapping(value = "/{nota}")
    public List<Trabalho> getMenorNota(@PathVariable("nota") int nota) {
        return trabalhoRepository.findByNotaLessThan(nota);

    }

    @PostMapping
    public Trabalho novoTrabalho(@RequestBody Trabalho trabalho) {
        return trabalhoRepository.save(trabalho);
    }

    @GetMapping(value = "/allTrabalhos")
    public List<Trabalho> findAllTrabalho(){
        return trabalhoRepository.findAll();
    }
    
}  


