package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Receita implements Serializable {
    private double valor;
    private LocalDate data;
    private CategoriaReceita categoria;
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public CategoriaReceita getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaReceita categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "RECEITA;" + categoria + ";" + data.getDayOfMonth() + "/"+ data.getMonthValue() + "/" + data.getYear() + ";" + valor;
    }
}
