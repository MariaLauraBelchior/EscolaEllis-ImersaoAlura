package com.example.Escolaellis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Escolaellis.dtos.AlunoDTO;
import com.example.Escolaellis.entities.Aluno;
import com.example.Escolaellis.repositories.AlunoRepository;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();
    }

    public Aluno salvar(AlunoDTO dto) {
        Aluno aluno = new Aluno();
        aluno.setNome(dto.nome());
        aluno.setEmail(dto.email());
        aluno.setTelefone(dto.telefone());
        return alunoRepository.save(aluno);
    }

    public Aluno buscarPorId(Long id) {
        return alunoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }

    public void deletar(Long id) {
        alunoRepository.deleteById(id);
    }
}