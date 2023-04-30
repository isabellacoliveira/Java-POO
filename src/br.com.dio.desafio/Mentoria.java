package br.com.dio.desafio;

import java.time.LocalDate;

// extends: é filha
public class Mentoria extends Conteudo {
    // mentoria é um conteudo mas um conteudo não é uma mentoria 
    @Override
    public String toString() {
        return "Mentoria [data=" + data + "]";
    }

    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d; 
    }
   
}
