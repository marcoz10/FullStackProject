package com.pokeApp.Pokemon_App.Repository;

import com.pokeApp.Pokemon_App.Entity.Trainer;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TrainerRepository extends CrudRepository<Trainer, String> {

}