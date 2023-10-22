package com.ahmetkemal.model.gamedata.weapon;

public abstract class Weapon {
    private String name;
    private float firerate;
    private float zoom;
    private int hDamage;
    private int bDamage;
    private int lDamage;
    private int maxAmmo;
    private int magAmmo;
    private int ammo;
    private float reloadSpeed;
    private int price;
    private Type type;

    public Weapon(String name, float firerate, float zoom, int hDamage, int bDamage, int lDamage, int maxAmmo, int magAmmo, int ammo, float reloadSpeed, int price, Type type){
        this.name = name;
        this.firerate = firerate;
        this.zoom = zoom;
        this.hDamage = hDamage;
        this.bDamage = bDamage;
        this.lDamage = lDamage;
        this.maxAmmo = maxAmmo;
        this.magAmmo = magAmmo;
        this.ammo = ammo;
        this.reloadSpeed = reloadSpeed;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getFirerate() {
        return firerate;
    }

    public void setFirerate(float firerate) {
        this.firerate = firerate;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public float getZoom() {
        return zoom;
    }

    public void setZoom(float zoom) {
        this.zoom = zoom;
    }

    public int gethDamage() {
        return hDamage;
    }

    public void sethDamage(int hDamage) {
        this.hDamage = hDamage;
    }

    public int getbDamage() {
        return bDamage;
    }

    public void setbDamage(int bDamage) {
        this.bDamage = bDamage;
    }

    public int getlDamage() {
        return lDamage;
    }

    public void setlDamage(int lDamage) {
        this.lDamage = lDamage;
    }

    public int getMagAmmo() {
        return magAmmo;
    }

    public void setMagAmmo(int magAmmo) {
        this.magAmmo = magAmmo;
    }

    public float getReloadSpeed() {
        return reloadSpeed;
    }

    public void setReloadSpeed(float reloadSpeed) {
        this.reloadSpeed = reloadSpeed;
    }

    public void fire(float fireRate, int ammo){
        System.out.println(name + " saniyede " + fireRate + " hızıyla ateş etmekte");
    };
    public void reload(){
        System.out.println(this.name + " " + this.reloadSpeed + " saniyede " + this.magAmmo + " mermi doldurmakta" );
    };
    public void rightClick(){
        System.out.println(this.name + ", " + this.zoom + "x scope açmakta");
    };

}
