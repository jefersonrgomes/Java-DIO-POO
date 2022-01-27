package br.com.br.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Developer {
    /*** ATRIBUTES ***/
    private String nome;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    private Set<Content> completedContent = new LinkedHashSet<>();

    /*** GETTERS AND SETTERS ***/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Content> getSubscribedContent() {
        return subscribedContent;
    }

    public void setSubscribedContent(Set<Content> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    public Set<Content> getCompletedContent() {
        return completedContent;
    }

    public void setCompletedContent(Set<Content> completedContent) {
        this.completedContent = completedContent;
    }

    /*** METHODS ***/
    public  void subscribeBootcamp(Bootcamp bootcamp){
        this.subscribedContent.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevelopers().add(this);
    }

    public void progress(){
        Optional<Content> content =  this.subscribedContent.stream().findFirst();
        if(content.isPresent()){
            this.completedContent.add(content.get());
            this.subscribedContent.remove(content.get());
        }

        else{
            System.err.println("Você não está matriculado em nenhum Bootcamp");
        }
    }

    public double calcularXp(){
        return this.completedContent.stream().mapToDouble(Content::calcularXp).sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return Objects.equals(subscribedContent, developer.subscribedContent) && Objects.equals(completedContent, developer.completedContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscribedContent, completedContent);
    }
}
