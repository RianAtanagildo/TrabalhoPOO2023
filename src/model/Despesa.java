package model;

import java.time.LocalDate;

public class Despesa {
    private int despesa;
    private double valor;
    private LocalDate data;
    private CategoriaDespesa categoria;

    public Despesa(int despesa, double valor, CategoriaDespesa categoria) {
        this.despesa = despesa;
        this.valor = valor;
        this.data = LocalDate.now();
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public CategoriaDespesa getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDespesa categoria) {
        this.categoria = categoria;
    }
}

