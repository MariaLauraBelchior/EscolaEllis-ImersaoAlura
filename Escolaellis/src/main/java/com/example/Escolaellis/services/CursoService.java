package com.example.Escolaellis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Escolaellis.dtos.CursoDTO;
import com.example.Escolaellis.entities.Curso;
import com.example.Escolaellis.repositories.CursoRepository;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> listarTodos() {
        return cursoRepository.findAll();
    }

    public Curso salvar(CursoDTO dto) {
        Curso curso = new Curso();
        curso.setNome(dto.nome());
        curso.setCodigo(dto.codigo());
        curso.setDescricao(dto.descricao());
        return cursoRepository.save(curso);
    }

    public Curso buscarPorId(Long id) {
        return cursoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Curso não encontrado"));
    }

    public void deletar(Long id) {
        cursoRepository.deleteById(id);
    }
    
}