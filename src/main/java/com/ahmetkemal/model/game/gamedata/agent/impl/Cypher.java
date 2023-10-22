package com.ahmetkemal.model.game.gamedata.agent.impl;


import com.ahmetkemal.model.game.gamedata.agent.Agent;
import com.ahmetkemal.model.game.gamedata.agent.Gender;
import com.ahmetkemal.model.game.gamedata.agent.Role;
import com.ahmetkemal.model.game.gamedata.agent.skill.impl.TrapSkill;
import com.ahmetkemal.model.game.gamedata.agent.skill.impl.VisionSkill;

public class Cypher extends Agent {

    public Cypher(){
        super("Cypher", 35, Gender.MALE, Role.SENTINEL);
    }

    @Override
    public void skillOne() {
        skill(new TrapSkill());
    }

    @Override
    public void skillTwo() {
        skill(new TrapSkill());
    }

    @Override
    public void ultimate() {
        skill(new VisionSkill());
    }
}
