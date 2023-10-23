package com.ahmetkemal.model.game;

import com.ahmetkemal.model.User;
import com.ahmetkemal.model.game.gamedata.agent.Agent;
import com.ahmetkemal.model.game.gamedata.weapon.Weapon;
import java.util.List;

public class Player {

    private int credit = 800;
    private int health = 100;
    private int shield = 0;
    private User user;
    private Agent agent;
    private List<Weapon> weapons;

    public Player(User user, Agent agent, List<Weapon> weapons) {
        this.user = user;
        this.agent = agent;
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

    public Agent getCharacter() {
        return agent;
    }

    public void setCharacter(Agent agent) {
        this.agent = agent;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }

    public Weapon buyWeapon(Weapon weapon) {
        if (weapon.getPrice() <= this.getCredit()) {
            this.setCredit(getCredit() - weapon.getPrice());
            return weapon;
        }
        System.out.println("Paranız " + weapon.getName() + " için yeterli değil");
        return null;
    }
}
