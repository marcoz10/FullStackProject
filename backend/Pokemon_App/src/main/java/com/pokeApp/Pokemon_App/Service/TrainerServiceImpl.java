package com.pokeApp.Pokemon_App.Service;


import com.pokeApp.Pokemon_App.DTO.TrainerDTO;
import com.pokeApp.Pokemon_App.Entity.Trainer;
import com.pokeApp.Pokemon_App.Repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service(value = "TrainerService")
public class TrainerServiceImpl implements TrainerService{

    @Autowired
    private TrainerRepository trainerRepository;


    @Override
    public TrainerDTO getTrainer(String email) {
        // Retrieve customer data from the repository
        TrainerDTO trainerDTO = new TrainerDTO();
        Optional<Trainer> trainer = trainerRepository.findById(email);
        if(trainer.isPresent()) {
            trainerDTO.setEmail(trainer.get().getEmail());
            trainerDTO.setFavoritePokemon(trainer.get().getFavoritePokemon());
            trainerDTO.setName(trainer.get().getName());
            trainerDTO.setListOfSquad(trainer.get().getListOfSquad());
            trainerDTO.setPassword(trainer.get().getPassword());
            trainerDTO.setCountry(trainer.get().getCountry());
            System.out.println(trainerDTO);
            return trainerDTO;
        }
        return null;
    }

    @Override
    public String registerNewTrainer(TrainerDTO trainerDTO) {

        boolean isIdEmpty = trainerRepository.findById(trainerDTO.getEmail()).isEmpty();
        if(isIdEmpty) {
            Trainer newTrainer = new Trainer();
            //newTrainer.setTrainerID(trainerDTO.getTrainerID());
            newTrainer.setName(trainerDTO.getName());
            newTrainer.setPassword(trainerDTO.getPassword());
            newTrainer.setEmail(trainerDTO.getEmail());
            newTrainer.setFavoritePokemon(trainerDTO.getFavoritePokemon());
            newTrainer.setCountry(trainerDTO.getCountry());
            trainerRepository.save(newTrainer);
            return "Registration is successful!";
        }
        return "Registration is failed.";
    }
}