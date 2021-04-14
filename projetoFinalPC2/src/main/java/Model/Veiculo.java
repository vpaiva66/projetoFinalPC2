/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author gedea
 */
public class Veiculo {
    private String nome;
    private String tipo;
    private Armas armas;
    

    public Veiculo(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.armas = new Armas();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Armas getArmas() {
        return armas;
    }

    public void setArmas(Armas armas) {
        this.armas = armas;
    }
}
