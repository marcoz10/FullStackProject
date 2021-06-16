package com.pokeApp.Pokemon_App.DTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class SquadDTO {

    private Integer squadID;

    @NotNull(message = "Squad name can not be empty")
    @Pattern(regexp = "[A-Z][a-z]{19}")
    private String squadName;

    private Integer slotOne;

    private Integer slotTwo;

    private Integer slotThree;

    private Integer slotFour;

    private Integer slotFive;

    private Integer slotSix;

    @Pattern(regexp = "[a-zA-Z0-9._]+@[a-zA-Z]{2,}\\.[a-zA-Z][a-zA-Z]+", message = "Invalid email format")
    private String trainerEmail;

    public Integer getSquadID() {
        return squadID;
    }

    public void setSquadID(Integer squadID) {
        this.squadID = squadID;
    }

    public String getSquadName() {
        return squadName;
    }

    public void setSquadName(String squadName) {
        this.squadName = squadName;
    }

    public Integer getSlotOne() {
        return slotOne;
    }

    public void setSlotOne(Integer slotOne) {
        this.slotOne = slotOne;
    }

    public Integer getSlotTwo() {
        return slotTwo;
    }

    public void setSlotTwo(Integer slotTwo) {
        this.slotTwo = slotTwo;
    }

    public Integer getSlotThree() {
        return slotThree;
    }

    public void setSlotThree(Integer slotThree) {
        this.slotThree = slotThree;
    }

    public Integer getSlotFour() {
        return slotFour;
    }

    public void setSlotFour(Integer slotFour) {
        this.slotFour = slotFour;
    }

    public Integer getSlotFive() {
        return slotFive;
    }

    public void setSlotFive(Integer slotFive) {
        this.slotFive = slotFive;
    }

    public Integer getSlotSix() {
        return slotSix;
    }

    public void setSlotSix(Integer slotSix) {
        this.slotSix = slotSix;
    }

    public String getTrainerEmail() {
        return trainerEmail;
    }

    public void setTrainerEmail(String trainerEmail) {
        this.trainerEmail = trainerEmail;
    }
}
