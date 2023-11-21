
package view;

import java.io.IOException;
import java.time.LocalDate;
import model.CategoriaReceita;
import model.Lancamento;
import model.Receita;

public class AppSemInterface {
    public static void main(String[] args) throws IOException {
        Receita r = new Receita();
        r.setCategoria(CategoriaReceita.SALARIO);
        r.getTipo();
        r.setData(LocalDate.now());
        r.setValor(1000);
        String filepath =  "C:\\Users\\riang\\Documents\\Arquiv\\test7.csv";
        Lancamento l = new Lancamento(filepath,r);
        l.lerDadosArquivo(filepath);
        

    }
}