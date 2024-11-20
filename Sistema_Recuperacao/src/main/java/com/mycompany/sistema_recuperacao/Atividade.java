package com.mycompany.sistema_recuperacao;

import javax.xml.crypto.Data;// para podermos usar datas 

public class Atividade {
    
    private String Titulo; 
    private String Discricao; 
    private Data DataLimite;
    private Disciplinas diciplina; 

    public Atividade(String Titulo, String Discricao,
            Disciplinas diciplina) {
        this.Titulo = Titulo;
        this.Discricao = Discricao;
        this.diciplina = diciplina;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDiscricao() {
        return Discricao;
    }

    public void setDiscricao(String Discricao) {
        this.Discricao = Discricao;
    }

    public Disciplinas getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(Disciplinas diciplina) {
        this.diciplina = diciplina;
    }
    
    //será possível deixar sem uma data para entregar 
    public void definirData(Data datafinal){ 
        datafinal = this.DataLimite;
    }
    
}
