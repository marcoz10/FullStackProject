package com.pokeApp.Pokemon_App.Entity;

import jdk.jfr.Enabled;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Squad")
public class Squad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer squadID;

    private String squadName;

    private Integer slotOne;

    private Integer slotTwo;

    private Integer slotThree;

    private Integer slotFour;

    private Integer slotFive;

    private Integer slotSix;

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