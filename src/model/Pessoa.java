package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private List<Receita> listaReceitas;
    private List<Despesa> listaDespesas;

    public Pessoa() {
        listaReceitas = new ArrayList<>();
        listaDespesas = new ArrayList<>();
    }

    public void IncluirReceita(Receita receita) {
        listaReceitas.add(receita);
    }

    public void IncluirDespesa(Despesa despesa) {
        listaDespesas.add(despesa);
    }

    public List<Receita> ListarReceitas() {
        return listaReceitas;
    }

    public List<Despesa> ListarDespesas() {
        return listaDespesas;
    }

    public double ConsultarSaldoAteData(LocalDate data) {
        double saldo = 0.0;

        for (Receita receita : listaReceitas) {
            if (receita.getData().isBefore(data) || receita.getData().isEqual(data)) {
                saldo += receita.getValor();
            }
        }
        for (Despesa despesa : listaDespesas) {
            if (despesa.getData().isBefore(data) || despesa.getData().equals(data)) {
                saldo -= despesa.getValor();
            }
        }

        return saldo;
    }
        

    public double ConsultarSaldoTotal() {
        double saldo = 0.0;

        for (Receita receita : listaReceitas) {
            saldo += receita.getValor();
        }

        for (Despesa despesa : listaDespesas) {
            saldo -= despesa.getValor();
        }

        return saldo;
    }
}