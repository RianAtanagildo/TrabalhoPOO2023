package view;

import java.time.LocalDate;
import model.CategoriaDespesa;
import model.Despesa;
import model.Pessoa;

public class AppSemInterface {
    public static void main(String[] args) {
        CategoriaDespesa categoriaAlimentacao = CategoriaDespesa.ALIMENTACAO;


        Despesa despesa1 = new Despesa(1, 500.0, categoriaAlimentacao);

        System.out.println("Despesa: " + despesa1.getDespesa());
        System.out.println("Valor: " + despesa1.getValor());
        System.out.println("Data: " + despesa1.getData());
        System.out.println("Categoria: " + despesa1.getCategoria());

        System.out.println("App.main(-----------------------------------------------)");
        Pessoa pessoa = new Pessoa();

        pessoa.IncluirDespesa(despesa1);

        double saldoTotal = pessoa.ConsultarSaldoTotal();
        System.out.println("Saldo total: " + saldoTotal);
    }
}