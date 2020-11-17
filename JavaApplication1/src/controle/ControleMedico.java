/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

//processos para, alterar excluir, pesquisar, etc

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloMedico;

public class ControleMedico {
    
ConexaoBD conex = new ConexaoBD();
    ModeloMedico mod = new ModeloMedico();
    
    public void Salvar (ModeloMedico mod){
        conex.conexao();
    try {
        PreparedStatement pst = conex.conn.prepareStatement("insert into Medicos (nome_medico,especialidade_medico,crm_medico) values (?,?,?)");
        pst.setString(1,mod.getNome());
       
        pst.setString(2,mod.getEpecialidade());
        pst.setInt(3, mod.getCrm());
        pst.execute();
        JOptionPane.showMessageDialog(null,"Dados Inseridos com Sucesso!");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Erro ao Inserir Dados!/n Erro:"+ex);
    }
        
        conex.desconecta();
    
    }
    
}
