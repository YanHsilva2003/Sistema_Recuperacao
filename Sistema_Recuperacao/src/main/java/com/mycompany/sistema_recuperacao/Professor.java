
package com.mycompany.sistema_recuperacao;

public class Professor extends Pessoa{

    private String departamento;
    private int prazoCorrecao;
    //private List<Disciplina> disciplinasMinistradas;
    //private List<Atividade> atividadesCriadas;

    public Professor(String departamento, int prazoCorrecao, 
            String Nome, String Email, String numero) {
        super( Nome, Email, numero);
        this.departamento = departamento;
        this.prazoCorrecao = prazoCorrecao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getPrazoCorrecao() {
        return prazoCorrecao;
    }

    public void setPrazoCorrecao(int prazoCorrecao) {
        this.prazoCorrecao = prazoCorrecao;
    }

    @Override
    public String StatusTest() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
