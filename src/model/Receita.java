package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A classe Receita representa uma entidade que contém informações sobre uma receita financeira, como valor, data e categoria. 
 * @author riang
 */
public class Receita implements Serializable {
    private double valor;
    private LocalDate data;
    private CategoriaReceita categoria;
    
    /**
     * Retorna o valor da receita.
     * @return 
     */
    public double getValor() {
        return valor;
    }
    
    /**
    * Define o valor da receita.
    * @param valor (double): Valor a ser atribuído à receita.
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Retorna a data da receita.
     * @return 
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Define a data da receita.
     * @param data  (LocalDate): Data a ser atribuída à receita.
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * Retorna a categoria da receita.
     * @return 
     */
    public CategoriaReceita getCategoria() {
        return categoria;
    }

    /**
     * Define a categoria da receita.
     * @param categoria (CategoriaReceita): Categoria a ser atribuída à receita.
     */
    public void setCategoria(CategoriaReceita categoria) {
        this.categoria = categoria;
    }

    /**
     * Transfere os dados da receita para um arquivo CSV.
     * @param arquivo (String): Caminho do arquivo CSV.
     * @param receita (Receita): Receita a ser transferida para o arquivo.
     * @throws IOException  Lançada se houver um erro ao escrever no arquivo CSV.
     */
    public void transferirArquivo (String arquivo, Receita receita) throws IOException{
        File file = new File(arquivo);
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))) {
            // Adicionar cabeçalho se o arquivo estiver vazio
            if (file.length() == 0) {
                writer.write("Categoria;Tipo;Data;Valor\n");
            }
            // Escreve dados ao arquivo CSV
            writer.write("RECEITA;");
            writer.write(receita.getCategoria() + ";");
            writer.write(receita.getData().toString() + ";");
            writer.write(String.valueOf(receita.getValor()));
            writer.write("\n"); // Adicionar uma nova linha
            System.out.println("Dados adicionados ao arquivo CSV com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo CSV: " + e.getMessage());
        }
    }

    /**
     * Retorna uma representação em string da receita no formato CSV.
     * @return 
     */
    @Override
    public String toString() {
        return "RECEITA;" + categoria + ";" + data.getDayOfMonth() + "/"+ data.getMonthValue() + "/" + data.getYear() + ";" + valor;
    }
}
