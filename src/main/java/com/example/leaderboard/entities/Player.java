package com.example.leaderboard.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nickName;

    @OneToMany(mappedBy = "player")
    @JsonManagedReference
    private Set<Achievement> achievements = new HashSet<>();

    @ManyToOne
    @JsonManagedReference
    private Country country;

    @ManyToMany
    @JsonIgnore
    private Set<Player> friends = new HashSet<>();

    public Player() {
    }

    public Player(String nickName) {
        this.nickName = nickName;
      }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Set<Achievement> getAchievements() {
        return achievements;
    }

    public void setAchievements(Set<Achievement> achievements) {
        this.achievements = achievements;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Set<Player> getFriends() {
        return friends;
    }

    public void setFriends(Set<Player> friends) {
        this.friends = friends;
    }
}
