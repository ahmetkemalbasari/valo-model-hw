package com.ahmetkemal.model.game.gamedata.agent.impl;


import com.ahmetkemal.model.game.gamedata.agent.Agent;
import com.ahmetkemal.model.game.gamedata.agent.Gender;
import com.ahmetkemal.model.game.gamedata.agent.Role;

public class Brimstone extends Agent {

    public Brimstone(){
        super("Brimstone", 45, Gender.MALE, Role.CONTROLLER);
    }

    @Override
    public void skillOne() {
        System.out.println("Brimstone molotof hazırladı");
    }

    @Override
    public void skillTwo() {
        System.out.println("Brimstone smoke attı");
    }

    @Override
    public void ultimate() {
        System.out.println("Brimstone alan lazerledi");
    }
}
