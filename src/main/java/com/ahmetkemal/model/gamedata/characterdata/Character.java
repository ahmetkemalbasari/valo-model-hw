package com.ahmetkemal.model.gamedata.characterdata;

public abstract class Character {

    private String name ;
    private int age;
    private Gender gender;
    private Role role;

    public Character(String name, int age, Gender gender, Role role){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public abstract void skillOne();
    public abstract void skillTwo();
    public abstract void ultimate();

}
