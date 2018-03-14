package com.example.leaderboard.Models;

import com.example.leaderboard.entities.Achievement;
import com.example.leaderboard.entities.Country;
import com.example.leaderboard.entities.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlayerDTO {

    private long id;

    private String nickname;

    private List<String> achievementNames = new ArrayList<>();

    private long totalPoints;

    private List<String> friendNames = new ArrayList<>();
    private long countryId;

//    private List<Country> countries = new ArrayList<>();

    public PlayerDTO() {
    }

    public PlayerDTO(Player player) {
        this.id = player.getId();
        this.nickname = player.getNickName();
        this.achievementNames = player.getAchievements().stream().map(achievement -> achievement.getName()).collect(Collectors.toList());
        this.totalPoints = player.getAchievements().stream().map(achievement -> achievement.getPoints()).reduce(0l, (a, b) -> a + b) ;
        this.friendNames = player.getFriends().stream().map(friend -> friend.getNickName()).collect(Collectors.toList());
        this.countryId = player.getCountry().getId();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<String> getAchievementNames() {
        return achievementNames;
    }

    public void setAchievementNames(List<String> achievementNames) {
        this.achievementNames = achievementNames;
    }

    public long getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(long totalPoints) {
        this.totalPoints = totalPoints;
    }

    public List<String> getFriendNames() {
        return friendNames;
    }

    public void setFriendNames(List<String> friendNames) {
        this.friendNames = friendNames;
    }

    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

//    public List<Country> getCountries() {
//        return countries;
//    }
//
//    public void setCountries(List<Country> countries) {
//        this.countries = countries;
//    }
}
