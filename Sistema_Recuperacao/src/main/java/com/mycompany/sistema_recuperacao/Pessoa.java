package com.mycompany.sistema_recuperacao;

public abstract class Pessoa{
    
    private int codigo; 
    private String Nome; 
    private String Email;
    private String numero; 

    public Pessoa(String Nome, String Email, String numero) {
        this.Nome = Nome;
        this.Email = Email;
        this.numero = numero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    
   
    public abstract String StatusTest();
}
