package org.example.Task;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.pojo.Player;
import org.example.pojo.Team;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestVagrant {

    private Team team;
    private String dataPath;

    public TestVagrant() {
        initializeTask();
    }

    public void initializeTask() {
        String jsonContent = this.getJsonContent();
        this.team = this.getTeamDetails(jsonContent);
    }

    private Team getTeamDetails(String jsonContent) {
        Team t = null;
        ObjectMapper o = new ObjectMapper();
        try {
            t = o.readValue(jsonContent, Team.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            //log this error
        }
        return t;
    }

    private String getJsonContent() {
        String content = "";
        try {
            Path path = Paths.get("src/main/resources/testdata.json");
            content = Files.readString(path,StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    public int getNumberOfForeignPlayersInTeam() {
        int counter = 0;
        if (team != null) {
            for (Player p : this.team.getPlayer()) {
                if (!p.getCountry().equals("India")) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public int getWicketKeeperCount() {
        int counter = 0;
        if (team != null) {
            for (Player p : this.team.getPlayer()) {
                if (p.getRole().equals("Wicket-keeper")) {
                    counter++;
                }
            }
        }
        return counter;
    }
}