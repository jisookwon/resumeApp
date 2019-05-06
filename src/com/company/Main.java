package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Resume> applicantMap = new HashMap<String, Resume>();
        Resume applicant = new Resume();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Name : ");
        String name = input.nextLine();
        System.out.print("Enter Email Address : ");
        String email = input.nextLine();
        Information inf = new Information(name, email);
        applicant.setInfoArr(inf);

        //get input
        String start="y";
        while (start.equalsIgnoreCase("y")) {
            String yn = "y";
            System.out.println("== Education ==");
            while (yn.equalsIgnoreCase("y")) {
                System.out.print("Enter Degree Type : ");
                String degree = input.nextLine();
                System.out.print("Enter Major : ");
                String major = input.nextLine();
                System.out.print("Enter University name : ");
                String university = input.nextLine();
                System.out.print("Enter Graduation Year : ");
                String graduation = input.nextLine();
                Education edu = new Education(degree, major, university, graduation);
                applicant.setEduArr(edu);
                System.out.print("Do you want to add more education?(y/n)");
                yn = input.nextLine();
            }


            yn = "y";
            System.out.println("== Experience ==");
            while (yn.equalsIgnoreCase("y")) {
                System.out.print("Enter Company Name : ");
                String company = input.nextLine();
                System.out.print("Enter Job Title : ");
                String title = input.nextLine();
                System.out.print("Enter Start Date : ");
                String sDate = input.nextLine();
                System.out.print("Enter End Date : ");
                String eDate = input.nextLine();
                System.out.print("Enter Job Description : ");
                String description = input.nextLine();
                Experience exp = new Experience(company, title, sDate, eDate, description);
                applicant.setExpArr(exp);
                System.out.print("Do you want to add more experience?(y/n)");
                yn = input.nextLine();
            }

            yn = "y";
            System.out.println("== Skills ==");
            while (yn.equalsIgnoreCase("y")) {
                System.out.print("Enter skill name : ");
                String skill = input.nextLine();
                System.out.print("Enter Competency Proficiency rating\n" +
                        "(1=Fundamental, 2=Novice, 3=Intermediate, 4=Advanced, 5=Expert) : ");
                String proficiency = input.nextLine();

                Skill ski = new Skill(skill, proficiency);
                applicant.setSkillArr(ski);
                System.out.print("Do you want to add more skills?(y/n)");
                yn = input.nextLine();
            }

            applicantMap.put(name, applicant);
            /*/for (String key : applicantMap.keySet()) {
                System.out.println(key + "\t" + applicantMap.get(key));
            }*/
            // Print Resume

            System.out.println("\n============================================");
            System.out.println(applicant.getInfoArr(0).toString());
            System.out.println("== Education ==");
            for (int i=0;i<applicant.eduArr.size();i++){
                System.out.println(applicant.getEduArr(i).toString());
            }
            System.out.println("== Experience ==");
            for (int i=0;i<applicant.expArr.size();i++) {
                System.out.println(applicant.getExpArr(i).toString());
            }
            System.out.println("== Skills ==");
            for (int i=0;i<applicant.skillArr.size();i++) {
                System.out.print(applicant.getSkillArr(i).toString());
            }
        }
    }
}


