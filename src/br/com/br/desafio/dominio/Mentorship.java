package br.com.br.desafio.dominio;

import java.time.LocalDate;

public class Mentorship extends Content {
    /*** ATRIBUTES ***/
    private LocalDate date;

    /*** GETTERS AND SETTERS ***/
    public LocalDate getData() {
        return date;
    }

    public void setData(LocalDate data) {
        this.date = data;
    }

    /*** METODOS ***/
    @Override
    public String toString() {
        return "\nMENTORIA\nTitulo: %s.\nDescrição: %s.\nData: %s.\nXP: %s."
                .formatted(
                        super.getTitle(),
                        super.getDescription(),
                        date,
                        calcularXp()
                );
    }

    @Override
    public double calcularXp() {
        return super.getXP_PADRAO() + 20d;
    }
}
