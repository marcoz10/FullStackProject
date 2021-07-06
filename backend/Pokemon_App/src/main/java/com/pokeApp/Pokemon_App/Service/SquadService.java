package com.pokeApp.Pokemon_App.Service;

import com.pokeApp.Pokemon_App.DTO.SquadDTO;

import java.util.List;

public interface SquadService {
    List<SquadDTO> getTrainerSquads(String trainerEmail);
    String addTrainerSquad(SquadDTO squadDTO);
}
