package com.example.Escolaellis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Escolaellis.entities.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    
}