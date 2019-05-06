package com.company;

import java.util.ArrayList;

public class Skill {
    private String skill;
    private String proficiency;



    public Skill() {
    }

    public Skill(String skill, String proficiency) {
        this.skill = skill;
        this.proficiency = proficiency;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }
}

