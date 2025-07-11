package com.example.Escolaellis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Escolaellis.entities.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

    
}