package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Despesa implements Serializable {
    private double valor;
    private LocalDate data;
    private CategoriaDespesa categoria;
    private String tipo="DESPESA";

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

    public CategoriaDespesa getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDespesa categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "DESPESA;" + categoria + ";" + data.getDayOfMonth() + "/"+ data.getMonthValue() + "/" + data.getYear() + ";" + valor;
    }
}
