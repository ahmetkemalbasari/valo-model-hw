package com.ahmetkemal.model.gamedata.characterdata.characters;


import com.ahmetkemal.model.gamedata.characterdata.Character;
import com.ahmetkemal.model.gamedata.characterdata.Gender;
import com.ahmetkemal.model.gamedata.characterdata.Role;

public class Brimstone extends Character {

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
