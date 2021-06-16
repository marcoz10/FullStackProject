package com.pokeApp.Pokemon_App.Config;

import com.pokeApp.Pokemon_App.Entity.Trainer;
import com.pokeApp.Pokemon_App.Repository.TrainerRepository;
import com.pokeApp.Pokemon_App.Service.TrainerService;
import com.pokeApp.Pokemon_App.Service.TrainerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;


@Configuration
public class SpringConfig {
    @Bean
    public TrainerService trainerService(){
        return new TrainerServiceImpl();
    }

}
