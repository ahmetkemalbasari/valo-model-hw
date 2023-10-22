package com.ahmetkemal.model.game.gamedata.agent.impl;


import com.ahmetkemal.model.game.gamedata.agent.Agent;
import com.ahmetkemal.model.game.gamedata.agent.Gender;
import com.ahmetkemal.model.game.gamedata.agent.Role;
import com.ahmetkemal.model.game.gamedata.agent.skill.impl.AreaDamageSkill;
import com.ahmetkemal.model.game.gamedata.agent.skill.impl.SpecialWeaponSkill;
import com.ahmetkemal.model.game.gamedata.agent.skill.impl.VisionSkill;

public class Sova extends Agent {

    public Sova(){
        super("Sova", 30, Gender.MALE, Role.INITIATOR);
    }

    @Override
    public void skillOne() {
        skill(new VisionSkill());
    }

    @Override
    public void skillTwo() {
        skill(new AreaDamageSkill());
    }

    @Override
    public void ultimate() {
        skill(new SpecialWeaponSkill());
    }
}
