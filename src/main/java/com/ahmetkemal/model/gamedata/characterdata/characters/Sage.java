package com.ahmetkemal.model.gamedata.characterdata.characters;


import com.ahmetkemal.model.gamedata.characterdata.Character;
import com.ahmetkemal.model.gamedata.characterdata.Gender;
import com.ahmetkemal.model.gamedata.characterdata.Role;

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
