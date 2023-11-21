package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;

public class Receita implements Serializable {
    private double valor;
    private LocalDate data;
    private CategoriaReceita categoria;
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public CategoriaReceita getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaReceita categoria) {
        this.categoria = categoria;
    }

    public void transferirArquivo (String arquivo, Receita receita) throws IOException{
        File file = new File(arquivo);
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))) {
            // Adicionar cabeçalho se o arquivo estiver vazio
            if (file.length() == 0) {
                writer.write("Categoria;Tipo;Data;Valor\n");
            }

            // Adicionar dados ao arquivo CSV
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

    @Override
    public String toString() {
        return "RECEITA;" + categoria + ";" + data.getDayOfMonth() + "/"+ data.getMonthValue() + "/" + data.getYear() + ";" + valor;
    }
}
