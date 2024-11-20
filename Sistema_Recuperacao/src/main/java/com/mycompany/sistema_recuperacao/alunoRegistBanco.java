
package com.mycompany.sistema_recuperacao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class alunoRegistBanco implements AlunoInterface{
    
    static String urlMysql = "jdbc:mysql://mysql.doctusedtech.com.br:3306/doctusedtech11";
    static java.sql.Connection conexao;

    @Override
    public void registraAluno(Aluno aluno) {
        
    }

    @Override
    public Aluno buscaAluno(String nome, String RA) {
        System.out.println("");
        return null;
    }
    
    
    
}
