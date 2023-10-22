package com.ahmetkemal.model.game.gamedata.agent.skill.impl;

import com.ahmetkemal.model.game.gamedata.agent.skill.Skill;

public class DashSkill implements Skill {
    @Override
    public void run() {
        System.out.println("Dash skill'ı kullanıldı");
    }
}
