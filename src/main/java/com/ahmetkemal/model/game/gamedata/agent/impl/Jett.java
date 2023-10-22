package com.ahmetkemal.model.game.gamedata.agent.impl;


import com.ahmetkemal.model.game.gamedata.agent.Agent;
import com.ahmetkemal.model.game.gamedata.agent.Gender;
import com.ahmetkemal.model.game.gamedata.agent.Role;

public class Jett extends Agent {

    public Jett(){
        super("Jett", 20, Gender.FEMALE, Role.DUELIST);
    }

    @Override
    public void skillOne() {
        System.out.println("Jett zıpladı");
    }

    @Override
    public void skillTwo() {
        System.out.println("Jett sis attı");
    }

    @Override
    public void ultimate() {
        System.out.println("Jett bıçaklarını çıkardı");
    }
}
