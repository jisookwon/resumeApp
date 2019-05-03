package com.company;

public class Skill extends Resume {
    private String skill;
    private int proficiency;

    public Skill() {
    }

    public Skill(String skill, int proficiency) {
        this.skill = skill;
        this.proficiency = proficiency;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getProficiency() {
        return proficiency;
    }

    public void setProficiency(int proficiency) {
        this.proficiency = proficiency;
    }
}

