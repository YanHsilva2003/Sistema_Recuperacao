package com.mycompany.sistema_recuperacao;
import java.util.ArrayList;
import java.util.Date;


public class Aluno extends Pessoa{
    
    private String RA; 
    private String dataNacimento;
    private String turma;
    private String responsavel; 
    /**private Media Nota; 
    /* private ArrayList<Atividade> atividade;  */
    
    public Aluno(String RA, String dataNacimento, String turma, String responsavel, 
             String Nome, String Email, String numero){
        super( Nome, Email, numero);
        this.RA = RA;
        this.dataNacimento = dataNacimento;
        this.turma = turma;
        this.responsavel = responsavel;
    }

    @Override
    public String StatusTest(){
        return super.getNome() +RA + dataNacimento + turma +  responsavel;
    }
 
}
