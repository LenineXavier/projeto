/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Juliana
 */
public class ModeloMedico {

        private int codigo;
    private String nome;
    private String epecialidade;
    private int crm;
    
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the epecialidade
     */
    public String getEpecialidade() {
        return epecialidade;
    }

    /**
     * @param epecialidade the epecialidade to set
     */
    public void setEpecialidade(String epecialidade) {
        this.epecialidade = epecialidade;
    }

    /**
     * @return the crm
     */
    public int getCrm() {
        return crm;
    }

    /**
     * @param crm the crm to set
     */
    public void setCrm(int crm) {
        this.crm = crm;
    }
    

    
}
