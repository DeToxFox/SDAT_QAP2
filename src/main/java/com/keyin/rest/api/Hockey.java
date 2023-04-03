package com.keyin.rest.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Hockey {
    @Id
    @SequenceGenerator(name = "hockey_sequence", sequenceName = "hockey_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "hockey_sequence")
    private long id;
    private String team;
    private String headCoach;
    private String teamCaptain;

    // Setters and Getters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getHeadCoach() {
        return headCoach;
    }

    public void setHeadCoach(String headCoach) {
        this.headCoach = headCoach;
    }

    public String getTeamCaptain() {
        return teamCaptain;
    }

    public void setTeamCaptain(String teamCaptain) {
        this.teamCaptain = teamCaptain;
    }
}
