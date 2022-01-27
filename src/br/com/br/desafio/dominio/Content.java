package br.com.br.desafio.dominio;

public abstract class Content {
    /*** ATRIBUTES ***/
    private static final double XP_PADRAO = 10d;
    private String title;
    private String description;
    /*** GETTERS AND SETTERS ***/
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getXP_PADRAO(){
        return XP_PADRAO;
    }
    /*** METODOS ***/
    public double calcularXp() {
        return XP_PADRAO;
    }
}
