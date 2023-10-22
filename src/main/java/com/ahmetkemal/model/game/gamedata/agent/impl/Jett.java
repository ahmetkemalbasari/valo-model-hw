package com.ahmetkemal.model.game.gamedata.agent.impl;


import com.ahmetkemal.model.game.gamedata.agent.Agent;
import com.ahmetkemal.model.game.gamedata.agent.Gender;
import com.ahmetkemal.model.game.gamedata.agent.Role;
import com.ahmetkemal.model.game.gamedata.agent.skill.impl.DashSkill;
import com.ahmetkemal.model.game.gamedata.agent.skill.impl.SmokeSkill;
import com.ahmetkemal.model.game.gamedata.agent.skill.impl.SpecialWeaponSkill;

public class Jett extends Agent {

    public Jett(){
        super("Jett", 20, Gender.FEMALE, Role.DUELIST);
    }

    @Override
    public void skillOne() {
        skill(new DashSkill());
    }

    @Override
    public void skillTwo() {
        skill(new SmokeSkill());
    }

    @Override
    public void ultimate() {
        skill(new SpecialWeaponSkill());
    }
}
