/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Juliana
 */
public class ConexaoBD {

    public Statement stm; //realiza as pesquisas
    public ResultSet rs; // guarda a pesquisa
    private String driver = "org.postgresql.Driver"; //drive padrão postgre
    private String caminho = "jdbc:postgresql://localhost:5432/projetoclinica1"; // caminho do banco e nome da  base
    private String usuario = "postgres";
    private String senha = "090219";
    public Connection conn; //variável para criar conexão
    
    //metódo para conectar com o banco de dados
    public void conexao(){
       
        try {
             System.setProperty("jdbs.Drivers", driver); //setar driver de conexão
            conn = DriverManager.getConnection(caminho, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conexão Efetuada com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar no banco de dados:\n"+ex.getMessage());
        }
    }
    
    //método para desconectar com banco de dados
    public void desconecta(){
        try {
            conn.close();
            JOptionPane.showMessageDialog(null, "Banco desconectado com sucesso.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fechar banco de dados:\n"+ex.getMessage());
        }
        
    }
}
