package com.pokeApp.Pokemon_App.entity;

import java.util.List;

public class Squads {
    private List<Pokemon> pokemonSquad;

    public Squads(){

    }

    public List<Pokemon> getPokemonSquad() {
        return pokemonSquad;
    }

    public void setPokemonSquad(List<Pokemon> pokemonSquad) {
        this.pokemonSquad = pokemonSquad;
    }
}
