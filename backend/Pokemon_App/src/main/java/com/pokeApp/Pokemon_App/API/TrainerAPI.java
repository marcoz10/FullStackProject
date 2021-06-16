package com.pokeApp.Pokemon_App.API;


import com.pokeApp.Pokemon_App.DTO.TrainerDTO;
import com.pokeApp.Pokemon_App.Service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping(value = "/trainer-api")
@Validated
public class TrainerAPI {
    @Autowired
    private TrainerService trainerService;

    @Autowired
    private Environment environment;

    @GetMapping(value ="/trainer/{ID}/getTrainer")
    public ResponseEntity<TrainerDTO> getTrainer(@PathVariable("ID")  String trainerID){
        TrainerDTO trainerDTO = trainerService.getTrainer(trainerID);
        return new ResponseEntity<>(trainerDTO, HttpStatus.OK);
    }

    @PostMapping(value = "/trainer/addTrainer")
    public ResponseEntity<String> addTrainer(@Valid @RequestBody TrainerDTO trainerDTO){
        String res = trainerService.registerNewTrainer(trainerDTO);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}