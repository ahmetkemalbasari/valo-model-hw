package com.ahmetkemal.model.game.gamedata.mapdata.impl;

import com.ahmetkemal.model.game.gamedata.mapdata.Area;
import com.ahmetkemal.model.game.gamedata.mapdata.Map;
import java.util.List;

public class Haven extends Map {

    public Haven(Area spawn1, Area spawn2, List<Area> spikeAreas){
        super("Haven", spawn1, spawn2, spikeAreas);
    }

    @Override
    public void mapGimmick() {
        System.out.println("Map'in özel bir yapsı yok");
    }
}
