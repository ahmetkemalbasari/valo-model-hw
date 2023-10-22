package com.ahmetkemal.model.game.gamedata.mapdata;

public class Area {

    private float length;
    private float width;

    public Area(float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
}
