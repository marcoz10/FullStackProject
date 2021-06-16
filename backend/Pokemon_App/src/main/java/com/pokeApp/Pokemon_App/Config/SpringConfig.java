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

//    @Bean
//    public TrainerRepository trainerRepository(){
//        return new TrainerRepository() {
//            @Override
//            public <S extends Trainer> S save(S s) {
//                return null;
//            }
//
//            @Override
//            public <S extends Trainer> Iterable<S> saveAll(Iterable<S> iterable) {
//                return null;
//            }
//
//            @Override
//            public Optional<Trainer> findById(Integer integer) {
//                return Optional.empty();
//            }
//
//            @Override
//            public boolean existsById(Integer integer) {
//                return false;
//            }
//
//            @Override
//            public Iterable<Trainer> findAll() {
//                return null;
//            }
//
//            @Override
//            public Iterable<Trainer> findAllById(Iterable<Integer> iterable) {
//                return null;
//            }
//
//            @Override
//            public long count() {
//                return 0;
//            }
//
//            @Override
//            public void deleteById(Integer integer) {
//
//            }
//
//            @Override
//            public void delete(Trainer trainer) {
//
//            }
//
//            @Override
//            public void deleteAllById(Iterable<? extends Integer> iterable) {
//
//            }
//
//            @Override
//            public void deleteAll(Iterable<? extends Trainer> iterable) {
//
//            }
//
//            @Override
//            public void deleteAll() {
//
//            }
//        };
//    }
}
