package com.pokeApp.Pokemon_App.Entity;

import jdk.jfr.Enabled;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Squad")
public class Squad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SQUAD_ID")
    private Integer squadID;

    @Column(name = "SQUAD_NAME")
    private String squadName;

    @Column(name = "SLOT_ONE")
    private Integer slotOne;

}