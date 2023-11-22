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
 *
 * @author vinic
 */
public class Lancamento {
    private String tipo;
    private double valor;
    private LocalDate data;
    private String categoria;

    
    public Lancamento(){
        
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
   
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public  void lerArquivo(String caminhoArquivoCSV) {
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivoCSV));

            String colunas = leitor.readLine();
            if (colunas != null) {
                System.out.println("Colunas: " + colunas);
            }
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] elementos = linha.split(",");
                for (String elemento : elementos) {
                    System.out.print(elemento + " ");
                }
                System.out.println();
            }
            leitor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
