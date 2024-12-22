/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import enums.Contrato;
import enums.Titulo;

/**
 *
 * @author ejmcc
 */
public class Docente {
    private int matricula;
    private String nome;
    private String escola;
    private Titulo titulo;
    private Contrato contrato;

    // Construtor sem argumentos (padrão)
    public Docente() {
    }

    // Construtor com argumentos
    public Docente(int matricula, String nome, String escola, Titulo titulo, Contrato contrato) {
        this.matricula = matricula;
        this.nome = nome;
        this.escola = escola;
        this.titulo = titulo;
        this.contrato = contrato;
    }

    // Getters e Setters para todos os atributos

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
}
