package com.mycompany.sistema_recuperacao;
import javax.xml.crypto.Data;


public class Avaliacao {
    private RespostaAtividade respAtividade;
    private Aluno aluno; 
    private Professor professor; 
    private double nota; 
    private String Feedback; 
    private Data dataAvaliacao; 

    public Avaliacao(RespostaAtividade respAtividade, Aluno aluno, Professor professor, Data dataAvaliacao) {
        this.respAtividade = respAtividade;
        this.aluno = aluno;
        this.professor = professor;
        this.dataAvaliacao = dataAvaliacao;
    }

    public RespostaAtividade getRespAtividade() {
        return respAtividade;
    }

    public void setRespAtividade(RespostaAtividade respAtividade) {
        this.respAtividade = respAtividade;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Data getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(Data dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }
    
    
    public void atribuirNota(){
    
    
    }
    
    public void atribuirFeedback(){
    
    }
    
}
