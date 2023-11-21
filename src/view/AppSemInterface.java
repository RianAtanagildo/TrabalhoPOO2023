
package view;

import java.io.IOException;
import java.time.LocalDate;

import model.CategoriaDespesa;
import model.CategoriaReceita;
import model.Despesa;
import model.Receita;

public class AppSemInterface {
    public static void main(String[] args) throws IOException {
        Receita r = new Receita();
        r.setCategoria(CategoriaReceita.SALARIO);
        r.setData(LocalDate.now());
        r.setValor(1000);
        String filepath =  "C:\\Users\\vpavesi\\Documents\\test7.csv";
        r.transferirArquivo(filepath, r);

        Despesa d = new Despesa();
        d.setCategoria(CategoriaDespesa.ALIMENTACAO);
        d.setData(LocalDate.now());
        d.setValor(1.1);
        d.transferirArquivo(filepath, d);
        

    }
}