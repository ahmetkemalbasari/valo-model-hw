package com.ahmetkemal.model.game.gamedata.weapon.impl;

import com.ahmetkemal.model.game.gamedata.weapon.Type;
import com.ahmetkemal.model.game.gamedata.weapon.Weapon;

public class Classic extends Weapon {
    public Classic(){
        super("Classic", 0.15F, 0, 78, 26, 22, 36, 12, 12, 1.75F, 0, Type.SIDEARMS);
    }

    @Override
    public void rightClick() {
        System.out.println("3 mermiyi aynı anda ateşle ve bir daha ateşlemek için biraz bekle");
    }
}
