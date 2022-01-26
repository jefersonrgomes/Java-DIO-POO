package br.com.br.desafio.dominio;

public class Curso {

    /*** ATRIBUTES ***/
    private String title;
    private String description;
    private int workload; //carga horaria

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

    public int getCargaHoraria() {
        return workload;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.workload = cargaHoraria;
    }

    /*** METODOS ***/
    @Override
    public String toString() {
        return "\nCURSO\nTitulo: %s.\nDescrição: %s.\nCarga Horaria: %s Hs.".formatted(title, description, workload);
    }
}
