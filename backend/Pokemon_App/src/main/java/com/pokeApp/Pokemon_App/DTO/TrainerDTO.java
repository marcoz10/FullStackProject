package com.pokeApp.Pokemon_App.DTO;

import com.pokeApp.Pokemon_App.Entity.Squad;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

public class TrainerDTO {
    @Pattern(regexp = "[a-zA-Z0-9._]+@[a-zA-Z]{2,}\\.[a-zA-Z][a-zA-Z]+", message = "Invalid email format")
    private String email;

    @NotNull(message = "Trainer name can not be empty")
    @Pattern(regexp = "[A-Z][a-z]{19}")
    private String name;

    private Integer favoritePokemon;

    private String password;

    private String country;

    private List<Squad> listOfSquad;

    public String getPassword() {
        return password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getFavoritePokemon() {
        return favoritePokemon;
    }

    public void setFavoritePokemon(Integer favoritePokemon) {
        this.favoritePokemon = favoritePokemon;
    }

    public List<Squad> getListOfSquad() {
        return listOfSquad;
    }

    public void setListOfSquad(List<Squad> listOfSquads) {
        this.listOfSquad = listOfSquads;
    }
}