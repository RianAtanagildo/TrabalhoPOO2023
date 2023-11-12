/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vinic
 */
public class Receita {
   private int receita;
   private double valor;
   private int data;
   private CategoriaReceita categoria;

    public Receita(int receita, double valor, int data, CategoriaReceita categoria) {
        this.receita = receita;
        this.valor = valor;
        this.data = data;
        this.categoria = categoria;
    }

    public int getReceita() {
        return receita;
    }

    public void setReceita(int receita) {
        this.receita = receita;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

  

 
    
}
