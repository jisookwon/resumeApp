package com.company;

import java.util.ArrayList;

public class Skills {
    ArrayList<Skills> skillsArr = new ArrayList<>();

    public Skills() {
    }

    public Skills(ArrayList<Skills> skillsArr) {
        this.skillsArr = skillsArr;
    }

    public ArrayList<Skills> getSkillsArr() {
        return skillsArr;
    }

    public void setSkillsArr(ArrayList<Skills> skillsArr) {
        this.skillsArr = skillsArr;
    }
}

