package com.ahmetkemal.model.gamedata.characterdata.characters;


import com.ahmetkemal.model.gamedata.characterdata.Character;
import com.ahmetkemal.model.gamedata.characterdata.Gender;
import com.ahmetkemal.model.gamedata.characterdata.Role;

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
