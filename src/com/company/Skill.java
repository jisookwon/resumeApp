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

    public String getProficiency() { return proficiency; }
    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }
@Override
    public String toString(){
        String str="";
        switch(getProficiency()){
            case "1" :str="Fundamental";break;
            case "2" :str="Novice";break;
            case "3" :str="Intermediate";break;
            case "4" :str="Advanced";break;
            case "5" :str="Expert";break;
            default  :break;
        }
        return getSkill()+", "+str+"\n";

    }
}

