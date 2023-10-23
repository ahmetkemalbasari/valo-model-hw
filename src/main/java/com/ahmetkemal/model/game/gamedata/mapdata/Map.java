package com.ahmetkemal.model.game.gamedata.mapdata;

import java.util.List;

public abstract class Map {

    private String name;
    private Area ctSpawn;
    private Area tSpawn;
    private List<Area> plantSites;

    public Map(String name, Area ctSpawn, Area tSpawn, List<Area> plantSites){
        this.name = name;
        this.ctSpawn = ctSpawn;
        this.tSpawn = tSpawn;
        this.plantSites = plantSites;
    }

    public void mapGimmick(){};

}
