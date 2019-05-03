package com.company;

import java.util.ArrayList;

public class Resume {
    ArrayList<Information> infoArr = new ArrayList<>();
    ArrayList<Education>   eduArr = new ArrayList<>();
    ArrayList<Experience>  expArr = new ArrayList<>();
    ArrayList<Skill>       skillArr = new ArrayList<>();

    public Resume() { }

    public Resume(ArrayList<Information> infoArr, ArrayList<Education> eduArr, ArrayList<Experience> expArr, ArrayList<Skill> skillArr) {
        this.infoArr = infoArr;
        this.eduArr = eduArr;
        this.expArr = expArr;
        this.skillArr = skillArr;
    }

    public Information getInfoArr(int i) {
        return infoArr.get(i);
    }

    public void setInfoArr(Information inf) {
        infoArr.add(inf);
    }

    public Education getEduArr(int i) {
        return eduArr.get(i);
    }

    public void setEduArr(Education edu) {
        eduArr.add(edu);
    }

    public Experience getExpArr(int i) {
        return expArr.get(i);
    }

    public void setExpArr(Experience exp) {
        expArr.add(exp);
    }

    public Skill getSkillArr(int i) {
        return skillArr.get(i);
    }

    public void setSkillArr(Skill ski) {
        skillArr.add(ski);
    }

    /*Public String printResume(){

        return ""+infoArr.get(0).toString()+"\n";
    }*/



}
