package com.company;

public class Education {

    private String degree;
    private String major;
    private String university;
    private String graduation;

    public Education() {

    }

    public Education(String degree, String major, String university, String graduation) {
        this.degree = degree;
        this.major = major;
        this.university = university;
        this.graduation = graduation;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }
    @Override
    public String toString(){
        return "Degree Type : " + getDegree()+"\n Major : "+getMajor()+"\nUniversity Name : "+getUniversity()+"\nGraduation Year: "+ getGraduation();
    }
}


