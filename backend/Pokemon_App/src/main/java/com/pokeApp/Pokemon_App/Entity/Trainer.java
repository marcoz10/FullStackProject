package com.pokeApp.Pokemon_App.Entity;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "TRAINER")
public class Trainer {

    @Id
    private String email;


    private String name;


    Integer favoritePokemon;


    private String country;


    private String password;

    @OneToMany
    private List<Squad> listOfSquad;

    public Trainer(String name){
        this.name = name;
    }

    public Trainer() {

    }
    public String getPassword() {
        return password;
    }

    public void setListOfSquad(List<Squad> listOfSquad) {
        this.listOfSquad = listOfSquad;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Squad> getListOfSquad() {
        return listOfSquad;
    }

    public void setListOfSquads(List<Squad> listOfSquads) {
        this.listOfSquad = listOfSquad;
    }

    public Integer getFavoritePokemon() {
        return favoritePokemon;
    }

    public void setFavoritePokemon(Integer favoritePokemon) {
        this.favoritePokemon = favoritePokemon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}