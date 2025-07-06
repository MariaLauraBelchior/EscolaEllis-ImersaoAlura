package com.example.Escolaellis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Escolaellis.dtos.MatriculaDTO;
import com.example.Escolaellis.entities.Aluno;
import com.example.Escolaellis.entities.Curso;
import com.example.Escolaellis.entities.Matricula;
import com.example.Escolaellis.repositories.AlunoRepository;
import com.example.Escolaellis.repositories.CursoRepository;
import com.example.Escolaellis.repositories.MatriculaRepository;

@Service
public class MatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    public List<Matricula> listarTodas() {
        return matriculaRepository.findAll();
    }

    public Matricula salvar(MatriculaDTO dto) {
        Aluno aluno = alunoRepository.findById(dto.alunoId())
            .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
        Curso curso = cursoRepository.findById(dto.cursoId())
            .orElseThrow(() -> new RuntimeException("Curso não encontrado"));

        Matricula matricula = new Matricula();
        matricula.setAluno(aluno);
        matricula.setCurso(curso);
        return matriculaRepository.save(matricula);
    }

    public void deletar(Long id) {
        matriculaRepository.deleteById(id);
    }
}