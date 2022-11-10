package com.example.trabalho.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.trabalho.entity.Trabalho;

public interface TrabalhoRepository extends JpaRepository<Trabalho, Long>{
    
    public List<Trabalho>findByNotaLessThan(int nota);
}
    

