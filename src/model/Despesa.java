package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A classe Despesa representa uma entidade que contém informações sobre uma despesa financeira,
 * como valor, data e categoria.
 * @author riang
 */
public class Despesa implements Serializable {
    private double valor;
    private LocalDate data;
    private CategoriaDespesa categoria;
   
    public Despesa (Double valor, LocalDate data, CategoriaDespesa categoria) throws IOException{
        setCategoria(categoria);
        setData(data);
        setValor(valor);
        transferirArquivo();
    }

    /**
     * Retorna o valor da despesa.
     * @return 
     */
    public double getValor() {
        return valor;
    }
    
    /**
     * Define o valor da despesa.
     * @param valor (double): Valor a ser atribuído à despesa.
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Retorna a data da despesa.
     * @return 
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Define a data da despesa.
     * @param data (LocalDate): Data a ser atribuída à despesa.
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * Retorna a categoria da despesa.
     * @return 
     */
    public CategoriaDespesa getCategoria() {
        return categoria;
    }

    /**
     * Define a categoria da despesa.
     * @param categoria (CategoriaDespesa): Categoria a ser atribuída à despesa.
     */
    public void setCategoria(CategoriaDespesa categoria) {
        this.categoria = categoria;
    }
    
    /**
     * Transfere os dados da despesa para um arquivo CSV.
     * @throws IOException Lançada se houver um erro ao escrever no arquivo CSV.
     */
    public void transferirArquivo () throws IOException{
        File file = new File("Lancamento.csv");
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            // Adicionar cabeçalho se o arquivo estiver vazio
            if (file.length() == 0) {
                writer.write("Categoria;Tipo;Data;Valor\n");
            }

            // Adicionar dados ao arquivo CSV
            try {
                writer.write("DESPESA;");
                writer.write(getCategoria() + ";");
                writer.write(getData().toString() + ";");
                writer.write(String.valueOf(getValor()));
                writer.write("\n"); // Adicionar uma nova linha
                System.out.println("Dados adicionados ao arquivo CSV com sucesso.");
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("A categoria ou o valor da despesa não é válido.", e);
            }
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo CSV: " + e.getMessage());
        }
    }

    /**
     * Retorna uma representação em string da despesa no formato CSV.
     * @return 
     */
    @Override
    public String toString() {
        if (valor < 0) {
        throw new IllegalArgumentException("O valor da despesa deve ser maior ou igual a zero.");
    }
        return "DESPESA;" + categoria + ";" + data.getDayOfMonth() + "/"+ data.getMonthValue() + "/" + data.getYear() + ";" + valor;
    }
}
