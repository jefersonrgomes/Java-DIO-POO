package br.com.br.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    /*** ATRIBUTES ***/
    private String title;
    private String description;
    private LocalDate date;

    /*** GETTERS AND SETTERS ***/
    public String getTitulo() {
        return title;
    }

    public void setTitulo(String titulo) {
        this.title = titulo;
    }

    public String getDescricao() {
        return description;
    }

    public void setDescricao(String descricao) {
        this.description = descricao;
    }

    public LocalDate getData() {
        return date;
    }

    public void setData(LocalDate data) {
        this.date = data;
    }
    /*** METODOS ***/
    @Override
    public String toString() {
        return "\nMENTORIA\nTitulo: %s.\nDescrição: %s.\nData: %s.".formatted(title, description, date);
    }
}
