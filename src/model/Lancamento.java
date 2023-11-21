/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
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

    public void setData(String data) {
        this.data = LocalDate(data);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void lerDadosArquivo(String filepath) throws IOException {
        File arquivo = new File(filepath);
        try (FileInputStream fis = new FileInputStream(arquivo);
             BufferedInputStream bis = new BufferedInputStream(fis);
             DataInputStream dis = new DataInputStream(bis)) {
            
            while (true) {
                this.setCategoria(dis.readUTF().trim());
                this.setTipo( dis.readUTF().trim() );
                this.setData( dis.readUTF().trim() );
                this.setValor(dis.readDouble());
            } 
        } catch (EOFException e) {
            
        }
        System.out.println("Categoria: " + this.getCategoria()+
                            " Tipo: " + this.getTipo() +
                            " Data: " + this.getData()+
                            " Valor: " + this.getValor());
    }


    private LocalDate LocalDate(String data1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
