package view;

import java.io.IOException;
import java.time.LocalDate;
import model.CategoriaDespesa;
import model.CategoriaReceita;
import model.Despesa;
import model.Lancamento;
import model.Pessoa;
import model.Receita;

public class AppSemInterface {
    public static void main(String[] args) throws IOException {
        Receita r = new Receita();
        r.setCategoria(CategoriaReceita.SALARIO);
        r.setData(LocalDate.now());
        r.setValor(77);
        String filepath =  "C:\\Users\\vMp\\Downloads\\test.csv";
        Lancamento l = new Lancamento(filepath, r);
        l.lerDadosArquivo(filepath);
        

    }
}