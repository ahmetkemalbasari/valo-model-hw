package com.ahmetkemal.model.game.gamedata.agent.impl;


import com.ahmetkemal.model.game.gamedata.agent.Agent;
import com.ahmetkemal.model.game.gamedata.agent.Gender;
import com.ahmetkemal.model.game.gamedata.agent.Role;

public class Sage extends Agent {

    public Sage(){
        super("Cypher", 35, Gender.MALE, Role.SENTINEL);
    }

    @Override
    public void skillOne() {
        System.out.println("Cypher kafes attı");
    }

    @Override
    public void skillTwo() {
        System.out.println("Cypher tuzak attı");
    }

    @Override
    public void ultimate() {
        System.out.println("Cypher diğer oyuncuların konumunu gösterdi");
    }
}
