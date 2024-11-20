package com.mycompany.sistema_recuperacao;

/**
 A interface serve para garantir a existência do métodos na 
  classe de acesso 
 */
public interface AlunoInterface {
    
    void registraAluno(Aluno aluno);
    Aluno buscaAluno(String nome, String RA);
}
