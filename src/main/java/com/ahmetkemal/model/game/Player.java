package com.ahmetkemal.model.game;

import com.ahmetkemal.model.game.gamedata.character.Character;
import com.ahmetkemal.model.game.gamedata.weapon.Weapon;
import java.util.List;

public class Player {

    private int credit = 800;
    private int health = 100;
    private int shield = 0;
    private User user;
    private Character character;
    private List<Weapon> weapons;

    public Player(User user, Character character, List<Weapon> weapons) {
            this.user = user;
            this.character = character;
            this.weapons = weapons;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }
}
