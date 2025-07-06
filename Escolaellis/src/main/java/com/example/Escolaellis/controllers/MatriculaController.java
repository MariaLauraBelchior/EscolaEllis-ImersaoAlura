package com.example.Escolaellis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Escolaellis.dtos.MatriculaDTO;
import com.example.Escolaellis.entities.Matricula;
import com.example.Escolaellis.services.MatriculaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaService matriculaService;

    public List<Matricula> listar() {
        return matriculaService.listarTodas();
    }
    
    @PostMapping
    public Matricula criar(@RequestBody @Valid MatriculaDTO dto) {
        return matriculaService.salvar(dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        matriculaService.deletar(id);
    }
}
