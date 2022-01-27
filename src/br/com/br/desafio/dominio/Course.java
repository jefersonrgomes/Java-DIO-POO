package br.com.br.desafio.dominio;

public class Course extends Content {
    /*** ATRIBUTES ***/
    private int workload; //carga horaria

    /*** GETTERS AND SETTERS ***/
    public int getCargaHoraria() {
        return workload;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.workload = cargaHoraria;
    }

    /*** METODOS ***/
    @Override
    public String toString() {
        return "\nCURSO\nTitulo: %s.\nDescrição: %s.\nCarga Horaria: %s Hs.\nXP Adquirido: %s.".formatted(super.getTitle(), super.getDescription(), workload, calcularXp());
    }
    @Override
    public double calcularXp() {
        return super.getXP_PADRAO() * workload;
    }
}
