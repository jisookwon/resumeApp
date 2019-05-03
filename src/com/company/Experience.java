package com.company;

public class Experience extends Resume{

    private String company;
    private String title;
    private String sDate;
    private String eDate;
    private String description;

    public Experience() {
    }

    public Experience(String company, String title, String sDate, String eDate, String description) {
        this.company = company;
        this.title = title;
        this.sDate = sDate;
        this.eDate = eDate;
        this.description = description;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getsDate() {
        return sDate;
    }

    public void setsDate(String sDate) {
        this.sDate = sDate;
    }

    public String geteDate() {
        return eDate;
    }

    public void seteDate(String eDate) {
        this.eDate = eDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
