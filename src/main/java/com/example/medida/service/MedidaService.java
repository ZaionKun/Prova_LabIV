package com.example.medida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medida.entity.Medida;
import com.example.medida.repository.MedidaRepository;

@Service
public class MedidaService {
    @Autowired
    private MedidaRepository medida;
    public List<Medida> buscar(){
        return medida.findAll();
    }

    public Medida add(Medida medida){
        return this.medida.save(medida);
    }
}
