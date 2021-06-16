package com.pokeApp.Pokemon_App.Service;

import com.pokeApp.Pokemon_App.DTO.SquadDTO;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service(value = "SquadService")
public class SquadServiceImpl implements SquadService {

    @Override
    public List<SquadDTO> getTrainerSquads(String trainerEmail) {
        return null;
    }

    @Override
    public void addTrainerSquad(String trainerEmail, SquadDTO squadDTO) {

    }
}
