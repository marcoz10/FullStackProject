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

            for(Squad s : trainerSquads){
                SquadDTO newSquadDTO = new SquadDTO();
                newSquadDTO.setSquadID(s.getSquadID());
                newSquadDTO.setSquadName(s.getSquadName());
                newSquadDTO.setSlotOne(s.getSlotOne());
                newSquadDTO.setSlotTwo(s.getSlotTwo());
                newSquadDTO.setSlotThree(s.getSlotThree());
                newSquadDTO.setSlotFour(s.getSlotFour());
                newSquadDTO.setSlotFive(s.getSlotFive());
                newSquadDTO.setSlotSix(s.getSlotSix());
                newSquadDTO.setTrainerEmail(optionalTrainer.get().getEmail());
                trainerSquadsDTO.add(newSquadDTO);
            }
            return trainerSquadsDTO;
        }

        return null;
    }

    @Override
    public String addTrainerSquad(SquadDTO squadDTO) {
        Optional<Trainer> optionalTrainer = trainerRepository.findById(squadDTO.getTrainerEmail());

        if(optionalTrainer.isPresent()){

            Squad newSquad = new Squad();
            newSquad.setSquadID(squadDTO.getSquadID());
            newSquad.setSquadName(squadDTO.getSquadName());
            newSquad.setSlotOne(squadDTO.getSlotOne());
            newSquad.setSlotTwo(squadDTO.getSlotTwo());
            newSquad.setSlotThree(squadDTO.getSlotThree());
            newSquad.setSlotFour(squadDTO.getSlotFour());
            newSquad.setSlotFive(squadDTO.getSlotFive());
            newSquad.setSlotSix(squadDTO.getSlotSix());
            newSquad.setTrainerEmail(squadDTO.getTrainerEmail());
            squadRepository.save(newSquad);
            return "Squad Added successfully";
        }
        return "Squad was not added";
    }
}

