/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifmt.edu.tga.NossoMVC.controller;

import java.util.ArrayList;
import java.util.List;
import br.ifmt.edu.tga.NossoMVC.model.Model;

/**
 *
 * @author hento_cn4ooqw
 */
public class Controller {

    public float calcula(Model i) {
        i.setImc();
        float imc = i.getImc();
        return imc;
    }

    public void grava(Model i) {
        calcula(i);
        lm.add(i);
        System.out.println("Dados Salvos:"
                + "\n\tCálculo: " + (lm.size() - 1)
                + "\n\tNome: " + lm.get(lm.size() - 1).getNome()
                + "\n\tPeso: " + lm.get(lm.size() - 1).getPeso()
                + "\n\tAltura: " + lm.get(lm.size() - 1).getAltura()
                + "\n\tIMC: " + lm.get(lm.size() - 1).getImc());
    }

    public void imprimeLista() {
        System.out.println("Dados obtidos da lista:");
        int c = 0;
        while (c < lm.size()) {
            System.out.println("Cálculo: " + c
                    + "\tNome: " + lm.get(c).getNome()
                    + "\tPeso: " + lm.get(c).getPeso()
                    + "\tAltura: " + lm.get(c).getAltura()
                    + "\tIMC: " + lm.get(c).getImc()
                    + "\n\tMenos que 18.5: Magreza "
                    + "\n\tEntre 18.5 E 24.9: Normal"
                    + "\n\tEntre 25,0 E 29,9: Sobrepeso"
                    + "\n\tMaior que 30: Obesidade"   );
            c++;
        }
    }
    private final List<Model> lm = new ArrayList();
}
