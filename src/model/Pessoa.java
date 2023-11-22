package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * A classe Pessoa representa um indivíduo que possui listas de receitas e despesas financeiras,
 * permitindo a inclusão, listagem e consulta de saldo.
 * @author riang
 */
public class Pessoa {
    private List<Receita> listaReceitas;
    private List<Despesa> listaDespesas;

    /**
     * Construtor padrão que inicializa as listas de receitas e despesas como instâncias vazias de ArrayList.
     */
    public Pessoa() {
        listaReceitas = new ArrayList<>();
        listaDespesas = new ArrayList<>();
    }

    /**
     *Inclui uma receita à lista de receitas da pessoa.
     * @param receita (Receita): Receita a ser incluída.
     */
    public void IncluirReceita(Receita receita) {
        listaReceitas.add(receita);
    }

    /**
     * Inclui uma despesa à lista de despesas da pessoa.
     * @param despesa (Despesa): Despesa a ser incluída.
     */
    public void IncluirDespesa(Despesa despesa) {
        listaDespesas.add(despesa);
    }

    /**
     * Retorna a lista de receitas associadas à pessoa.
     * @return 
     */
    public List<Receita> ListarReceitas() {
        return listaReceitas;
    }

    /**
     * Retorna a lista de despesas associadas à pessoa.
     * @return 
     */
    public List<Despesa> ListarDespesas() {
        return listaDespesas;
    }

    /**
     *Consulta o saldo até uma determinada data, considerando receitas e despesas.
     * @param data(LocalDate): Data limite para a consulta de saldo.
     * @return 
     */
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
       
    /**
     * Consulta o saldo total, considerando todas as receitas e despesas.
     * @return 
     */
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