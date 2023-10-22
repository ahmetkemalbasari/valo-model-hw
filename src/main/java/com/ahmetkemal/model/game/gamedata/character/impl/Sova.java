package com.ahmetkemal.model.game.gamedata.character.impl;


import com.ahmetkemal.model.game.gamedata.character.Character;
import com.ahmetkemal.model.game.gamedata.character.Gender;
import com.ahmetkemal.model.game.gamedata.character.Role;

public class Sova extends Character {

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
