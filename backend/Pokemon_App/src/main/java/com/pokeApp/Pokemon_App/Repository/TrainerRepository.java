package com.pokeApp.Pokemon_App.Repository;

import com.pokeApp.Pokemon_App.Entity.Trainer;

import org.springframework.data.repository.CrudRepository;

public interface TrainerRepository extends CrudRepository<Trainer, String> {

}