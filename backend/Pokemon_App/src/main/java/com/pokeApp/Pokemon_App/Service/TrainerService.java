package com.pokeApp.Pokemon_App.Service;

import com.pokeApp.Pokemon_App.DTO.TrainerDTO;
import com.pokeApp.Pokemon_App.Entity.Trainer;

import java.util.List;

public interface TrainerService {
    TrainerDTO getTrainer(String id);

    String registerNewTrainer(TrainerDTO trainerDTO);
}