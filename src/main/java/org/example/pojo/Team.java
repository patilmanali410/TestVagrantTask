package org.example.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Team {
    @JsonProperty("name")
    private String name;
    @JsonProperty("location")
    private String location;
    @JsonProperty("player")
    private Player[] player;

    public Team(String name, String location, Player[] player) {
        this.name = name;
        this.location = location;
        this.player = player;
    }

    public Team(){

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Player[] getPlayer() {
        return this.player;
    }

    public void setPlayer(Player[] player) {
        this.player = player;
    }

}
