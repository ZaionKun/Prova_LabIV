package com.example.medida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.medida.entity.Medida;
import com.example.medida.service.MedidaService;

@RestController
@CrossOrigin
@RequestMapping(value = "/sensor")
public class MedidaController {
    @Autowired
    private MedidaService medidaService;
    @GetMapping
    public List<Medida> findAllMedida(){
        return medidaService.buscar();
    }
    
    @PostMapping
    public Medida adicionarMedida(@RequestBody Medida medida){
        return medidaService.add(medida);
    }
    }


