package com.pokeApp.Pokemon_App.entity;

import java.util.List;

public class Trainer {

    Integer trainerID;

    private String name;
    List<Squads> listOfSquads;
    String favoritePokemon;
    private String email;

    public Trainer(String name){
        this.name = name;
    }

    public Integer getTrainerID() {
        return trainerID;
    }

    public void setTrainerID(Integer trainerID) {
        this.trainerID = trainerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Squads> getListOfSquads() {
        return listOfSquads;
    }

    public void setListOfSquads(List<Squads> listOfSquads) {
        this.listOfSquads = listOfSquads;
    }

    public String getFavoritePokemon() {
        return favoritePokemon;
    }

    public void setFavoritePokemon(String favoritePokemon) {
        this.favoritePokemon = favoritePokemon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
