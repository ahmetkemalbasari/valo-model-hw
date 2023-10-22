package com.ahmetkemal.model.game.gamedata.character.impl;


import com.ahmetkemal.model.game.gamedata.character.Character;
import com.ahmetkemal.model.game.gamedata.character.Gender;
import com.ahmetkemal.model.game.gamedata.character.Role;

public class Jett extends Character {

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
