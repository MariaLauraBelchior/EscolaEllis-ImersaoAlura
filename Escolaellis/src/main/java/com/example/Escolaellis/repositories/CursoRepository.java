package com.example.Escolaellis.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Escolaellis.entities.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

    Optional<Curso> findByCodigo(String codigo);
}
