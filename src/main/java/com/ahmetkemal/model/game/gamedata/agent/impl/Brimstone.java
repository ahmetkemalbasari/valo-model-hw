package com.ahmetkemal.model.game.gamedata.agent.impl;


import com.ahmetkemal.model.game.gamedata.agent.Agent;
import com.ahmetkemal.model.game.gamedata.agent.Gender;
import com.ahmetkemal.model.game.gamedata.agent.Role;
import com.ahmetkemal.model.game.gamedata.agent.skill.impl.AreaDamageSkill;
import com.ahmetkemal.model.game.gamedata.agent.skill.impl.LaserSkill;
import com.ahmetkemal.model.game.gamedata.agent.skill.impl.SmokeSkill;

public class Brimstone extends Agent {

    public Brimstone(){
        super("Brimstone", 45, Gender.MALE, Role.CONTROLLER);
    }

    @Override
    public void skillOne() {
        skill(new SmokeSkill());
    }

    @Override
    public void skillTwo() {
        skill(new AreaDamageSkill());
    }

    @Override
    public void ultimate() {
        skill(new LaserSkill());
    }
}
