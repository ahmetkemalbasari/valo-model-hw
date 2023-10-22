package com.ahmetkemal.model.game;

import java.util.List;

public class Game {

    private List<Player> teamOnePlayers, teamTwoPlayers;
    private int roundCount = 1, teamOneScore = 0, teamTwoScore = 0;

    public Game(List<Player> teamOnePlayers, List<Player> teamTwoPlayers){
        this.teamOnePlayers = teamOnePlayers;
        this.teamTwoPlayers = teamTwoPlayers;
    }

    public List<Player> getTeamOnePlayers() {
        return teamOnePlayers;
    }

    public void setTeamOnePlayers(List<Player> teamOnePlayers) {
        this.teamOnePlayers = teamOnePlayers;
    }

    public List<Player> getTeamTwoPlayers() {
        return teamTwoPlayers;
    }

    public void setTeamTwoPlayers(List<Player> teamTwoPlayers) {
        this.teamTwoPlayers = teamTwoPlayers;
    }

    public int getRoundCount() {
        return roundCount;
    }

    public void setRoundCount(int roundCount) {
        this.roundCount = roundCount;
    }

    public int getTeamOneScore() {
        return teamOneScore;
    }

    public void setTeamOneScore(int teamOneScore) {
        this.teamOneScore = teamOneScore;
    }

    public int getTeamTwoScore() {
        return teamTwoScore;
    }

    public void setTeamTwoScore(int teamTwoScore) {
        this.teamTwoScore = teamTwoScore;
    }

    public void win(){
        if(teamOneScore == 15 && teamOneScore !=teamTwoScore){
            System.out.println("Ilk takim kazandi");
            rankPoint(teamOnePlayers, 20);
            rankPoint(teamTwoPlayers, -20);
        }
        else if(teamTwoScore == 15 && teamOneScore != teamTwoScore) {
            System.out.println("Ikinci takim kazandi");
            rankPoint(teamOnePlayers, -20);
            rankPoint(teamTwoPlayers, 20);
        }
        else if (teamOneScore == 15 && teamOneScore == teamTwoScore){
            System.out.println("Oyun berabere bitti");
            rankPoint(teamOnePlayers, 2);
            rankPoint(teamTwoPlayers, 2);
        }
    }

    public void rankPoint(List<Player> Players, int point){
        for(Player i : Players){
            i.getUser().setRankPoint(i.getUser().getRankPoint() + point);
            i.getUser().checkRankUp();
        }
    }
}
