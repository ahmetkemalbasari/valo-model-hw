package com.ahmetkemal.model.game.gamedata.weapon.impl;

import com.ahmetkemal.model.game.gamedata.weapon.Type;
import com.ahmetkemal.model.game.gamedata.weapon.Weapon;

public class Odin extends Weapon {
    public Odin(){
        super("Odin", 0.06F, 1.15F, 95, 38, 32, 200, 100, 100, 5, 3200, Type.MACHINEGUN);
    }
}
