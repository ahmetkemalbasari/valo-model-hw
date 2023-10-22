package com.ahmetkemal.model.game.gamedata.agent.impl;


import com.ahmetkemal.model.game.gamedata.agent.Agent;
import com.ahmetkemal.model.game.gamedata.agent.Gender;
import com.ahmetkemal.model.game.gamedata.agent.Role;

public class Sova extends Agent {

    public Sova(){
        super("Sova", 30, Gender.MALE, Role.INITIATOR);
    }

    @Override
    public void skillOne() {
        System.out.println("Sova görüş oku attı");
    }

    @Override
    public void skillTwo() {
        System.out.println("Sova şok oku attı");
    }

    @Override
    public void ultimate() {
        System.out.println("Sova lazer oku attı");
    }
}
