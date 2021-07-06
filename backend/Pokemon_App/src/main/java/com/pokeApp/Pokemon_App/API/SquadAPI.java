package com.pokeApp.Pokemon_App.API;

import com.pokeApp.Pokemon_App.DTO.SquadDTO;
import com.pokeApp.Pokemon_App.DTO.TrainerDTO;
import com.pokeApp.Pokemon_App.Entity.Squad;
import com.pokeApp.Pokemon_App.Service.SquadService;
import com.pokeApp.Pokemon_App.Service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@CrossOrigin
@RestController
@RequestMapping(value = "/squad-api")
@Validated
public class SquadAPI {
    @Autowired
    private SquadService squadService;

    @Autowired
    private Environment environment;

    @GetMapping(value = "/squad/{trainer_ID}/getSquad")
    public ResponseEntity<List<SquadDTO>> getSquad(@PathVariable("trainer_ID") String trainerEmail){
        List<SquadDTO> trainerSquad = squadService.getTrainerSquads(trainerEmail);
        return new ResponseEntity<>(trainerSquad, HttpStatus.OK);
    }

    @PostMapping(value = "/squad/addSquad")
    public ResponseEntity<String> addSquad(@Valid @RequestBody SquadDTO squadDTO){
        String res = squadService.addTrainerSquad(squadDTO);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
