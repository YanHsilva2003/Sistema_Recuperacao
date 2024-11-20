package com.mycompany.sistema_recuperacao;

import java.util.ArrayList;

public class Disciplinas {
    private String nome;
    private String Descricao; 
    private Professor Profresponsavel; 
    private ArrayList<Aluno> ListaAlunos;

    public Disciplinas(String nome, String Descricao, Professor Profresponsavel){
        this.nome = nome;
        this.Descricao = Descricao;
        this.Profresponsavel = Profresponsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public Professor getProfresponsavel() {
        return Profresponsavel;
    }

    public void setProfresponsavel(Professor Profresponsavel) {
        this.Profresponsavel = Profresponsavel;
    }
    
    public void adicionarAluno(Aluno addaluno){
        //Aqui eu criu a lista de aluno
        /*Cada aluno será adicionado no sistema, para isso devemos ter as 
        disciplinas criadas */
        ListaAlunos = new ArrayList();
        ListaAlunos.add(addaluno);
    
    }

    public void alunosMatriculados(){
        for(Aluno aluno : ListaAlunos){
            aluno.StatusTest();
        }
    
    }
      
}
