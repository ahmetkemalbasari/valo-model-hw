package com.ahmetkemal.model.gamedata.weapondata.weapons;

import com.ahmetkemal.model.gamedata.weapondata.Type;
import com.ahmetkemal.model.gamedata.weapondata.Weapon;

public class TacticalKnife extends Weapon {
    public TacticalKnife(){
        super("Tactical Knife", 0, 0, 50,50,50,0, 0, 0, 0, 0, Type.MELEE);
    }

    @Override
    public void fire(float fireRate, int ammo) {
        System.out.println("Hızlı bıçak sapla");
    }

    @Override
    public void rightClick() {
        System.out.println("Güçlü bıçak sapla");
    }

    @Override
    public void reload() {
        System.out.println("Hiçbir şey yapma");
    }
}
