package com.example.Escolaellis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Escolaellis.dtos.AlunoDTO;
import com.example.Escolaellis.entities.Aluno;
import com.example.Escolaellis.services.AlunoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<Aluno> listar() {
        return alunoService.listarTodos();
    }

    @PostMapping
    public Aluno criar(@RequestBody @Valid AlunoDTO dto) {
         return alunoService.salvar(dto);
    }

    @GetMapping("/{id}")
    public Aluno buscarPorId(@PathVariable Long id) {
        return alunoService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        alunoService.deletar(id);
    }
}
