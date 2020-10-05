/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifmt.edu.tga.NossoMVC.model;

/**
 *
 * @author hento_cn4ooqw
 */
public class Model {
    
    private String nome;
    private float peso;
    private float altura;
    private float imc;
    

    public float getImc() {
        return imc;
    }

    public void setImc() {
        this.imc = ((peso)/(altura*altura));
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}
