/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

/**
 * A classe Lancamento representa um lançamento financeiro, contendo informações como tipo, valor, data e categoria.
 * @author riang
 */
public class Lancamento {
    private String tipo;
    private double valor;
    private LocalDate data;
    private String categoria;

    /**
     * Construtor padrão que inicializa os atributos da classe.
     */
    public Lancamento(){
        
    }
    
    /**
     * Retorna o tipo do lançamento.
     * @return 
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o tipo do lançamento.
     * @param tipo (String): Tipo a ser atribuído ao lançamento.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /**
     * Retorna o valor do lançamento.
     * @return 
     */
    public double getValor() {
        return valor;
    }

    /**
     * Define o valor do lançamento.
     * @param valor (double): Valor a ser atribuído ao lançamento.
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Retorna a data do lançamento.
     * @return 
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Retorna a categoria do lançamento.
     * @return 
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define a categoria do lançamento.
     * @param categoria (String): Categoria a ser atribuída ao lançamento.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    /**
     * Lê um arquivo CSV contendo lançamentos financeiros.
     * IOException Lançada se houver um erro ao ler o arquivo CSV.
     */
    public  String lerArquivo() {
        try {
            BufferedReader leitor = new BufferedReader(new FileReader("Lancamento.csv"));

            String colunas = leitor.readLine();
            if (colunas != null) {
                System.out.println("Colunas: " + colunas);
            }
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] elementos = linha.split(",");
                for (String elemento : elementos) {
                    return elemento;
                }
                System.out.println();
            }
            leitor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Arquivo vazio";
    }
}
