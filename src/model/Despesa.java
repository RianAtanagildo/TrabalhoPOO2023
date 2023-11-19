package model;

import java.util.Date;

public class Despesa {
    private int despesa;
    private double valor;
    private Date data;
    private CategoriaDespesa categoria;

    public Despesa(int despesa, double valor, Date data, CategoriaDespesa categoria) {
        this.despesa = despesa;
        this.valor = valor;
        this.data = data;
        this.categoria = categoria;
    }

    public int getDespesa() {
        return despesa;
    }

    public void setDespesa(int despesa) {
        this.despesa = despesa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public CategoriaDespesa getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDespesa categoria) {
        this.categoria = categoria;
    }
}

