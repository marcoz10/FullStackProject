package com.pokeApp.Pokemon_App.Service;

import com.pokeApp.Pokemon_App.DTO.SquadDTO;
import com.pokeApp.Pokemon_App.Entity.Squad;
import com.pokeApp.Pokemon_App.Entity.Trainer;
import com.pokeApp.Pokemon_App.Repository.SquadRepository;
import com.pokeApp.Pokemon_App.Repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Transactional
@Service(value = "SquadService")
public class SquadServiceImpl implements SquadService {

    @Autowired
    private TrainerRepository trainerRepository;

    @Autowired
    private SquadRepository squadRepository;

    @Override
    public List<SquadDTO> getTrainerSquads(String trainerEmail) {
        Optional<Trainer> optionalTrainer = trainerRepository.findById(trainerEmail);
        if(optionalTrainer.isPresent()){
            List<Squad> trainerSquads = optionalTrainer.get().getListOfSquad();

            List<SquadDTO> trainerSquadsDTO = new ArrayList<>();


        }

        return null;
    }

    @Override
    public void addTrainerSquad(String trainerEmail, SquadDTO squadDTO) {

    }
}
