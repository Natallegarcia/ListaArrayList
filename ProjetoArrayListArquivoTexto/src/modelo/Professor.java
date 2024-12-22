/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ejmcc
 */
public class Professor {
    //Atributos
    private String matricula;
    private String nomeCompleto;
    private String nomeEscola;
   
    
    //Metodos
    
    public Professor(String matricula, String nomeCompleto) {
        this.matricula = matricula;
        this.nomeCompleto = nomeCompleto;
        this.nomeEscola = nomeEscola;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }
    
    
}
