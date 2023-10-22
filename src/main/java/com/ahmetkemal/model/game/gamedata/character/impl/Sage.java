package com.ahmetkemal.model.game.gamedata.character.impl;


import com.ahmetkemal.model.game.gamedata.character.Character;
import com.ahmetkemal.model.game.gamedata.character.Gender;
import com.ahmetkemal.model.game.gamedata.character.Role;

public class Sage extends Character {

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
