/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinic
 */
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

    
}
