package com.ahmetkemal.model.game.gamedata.agent.skill.impl;

import com.ahmetkemal.model.game.gamedata.agent.skill.Skill;

public class SmokeSkill implements Skill {
    @Override
    public void run() {
        System.out.println("Smoke atıldı");
    }
}
