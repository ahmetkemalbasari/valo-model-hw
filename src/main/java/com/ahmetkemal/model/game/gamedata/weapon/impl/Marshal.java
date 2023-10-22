package com.ahmetkemal.model.game.gamedata.weapon.impl;

import com.ahmetkemal.model.game.gamedata.weapon.Type;
import com.ahmetkemal.model.game.gamedata.weapon.Weapon;

public class Marshal extends Weapon {
    public Marshal(){
        super("Marshal", 0.6f, 3.5F, 202,101,85,15,5,5,0.5F,950, Type.SNIPERRIFLE);
    }

    @Override
    public void reload() {
        System.out.println(this.getName() + " " + this.getReloadSpeed() + " saniyede şarjöre 1 mermi ekler");
    }
}
