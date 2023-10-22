package com.ahmetkemal.model.game;

public class User {

    private String username;
    private String email;
    private String password;
    private int valorantPoint;
    private int rankPoint;
    private String rank;

    public User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
        this.valorantPoint = 0;
        this.rankPoint = 0;
        this.rank = null;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getValorantPoint() {
        return valorantPoint;
    }

    public void setValorantPoint(int valorantPoint) {
        this.valorantPoint = valorantPoint;
    }

    public int getRankPoint() {
        return rankPoint;
    }

    public void setRankPoint(int rankPoint) {
        this.rankPoint = rankPoint;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }


}
