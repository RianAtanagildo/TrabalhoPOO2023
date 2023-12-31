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
    
    public Receita(){
        
    }

    public Receita (Double valor, LocalDate data, CategoriaReceita categoria) throws IOException{
        setCategoria(categoria);
        setData(data);
        setValor(valor);
        transferirArquivo();
    }
    
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
     * @throws IOException  Lançada se houver um erro ao escrever no arquivo CSV.
     */
    public void transferirArquivo () throws IOException{
        File file = new File("Lancamento.csv");
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            // Adicionar cabeçalho se o arquivo estiver vazio
            if (file.length() == 0) {
                writer.write("Categoria;Tipo;Data;Valor\n");
            }
            // Escreve dados ao arquivo CSV
            try {
                writer.write("RECEITA;");
                writer.write(getCategoria() + ";");
                writer.write(getData().toString() + ";");
                writer.write(String.valueOf(getValor()));
                writer.write("\n"); // Adicionar uma nova linha
                System.out.println("Dados adicionados ao arquivo CSV com sucesso.");
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("A categoria ou o valor da receita não é válido.", e);
            }
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
        if (categoria == null) {
            throw new IllegalArgumentException("A categoria não pode ser nula.");
        }
        return "RECEITA;" + categoria + ";" + data.getDayOfMonth() + "/"+ data.getMonthValue() + "/" + data.getYear() + ";" + valor;
    }
}
