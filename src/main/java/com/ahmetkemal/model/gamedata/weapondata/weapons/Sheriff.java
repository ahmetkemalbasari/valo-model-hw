package com.ahmetkemal.model.gamedata.weapondata.weapons;

import com.ahmetkemal.model.gamedata.weapondata.Type;
import com.ahmetkemal.model.gamedata.weapondata.Weapon;

public class Sheriff extends Weapon {
    public Sheriff(){
        super("Sheriff", 0.25F, 0, 159, 55, 46, 24, 6, 6, 2.25F, 800, Type.SIDEARMS);
    }

    @Override
    public void rightClick() {
        System.out.println("Sheriff zoom atamaz");
    }
}
