package org.example.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Player {
    @JsonProperty("name")
    private String name;
    @JsonProperty("country")
    private String country;
    @JsonProperty("role")
    private String role;
    @JsonProperty("price-in-crores")
    private String price;

    public Player(String name, String country, String role, String price) {
        this.name = name;
        this.country = country;
        this.role = role;
        this.price = price;
    }

    public Player() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
