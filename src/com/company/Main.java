package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Resume> applicantArr = new ArrayList<Resume>();
        Resume applicant = new Resume();

        //promptUser(applicantArr);


    //private static String promptUser(ArrayList<Resume> applicantArr) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Name : ");
        String name = input.nextLine();
        System.out.print("Enter Email Address : ");
        String email = input.nextLine();

        System.out.print("==Education==\nEnter Degree Type : ");
        String degree = input.nextLine();
        System.out.print("Enter Major : ");
        String major = input.nextLine();
        System.out.print("Enter University name : ");
        String university = input.nextLine();
        System.out.print("Enter Graduation Year : ");
        String graduation = input.nextLine();

        System.out.print("==Experience==\nEnter Company Name : ");
        String company = input.nextLine();
        System.out.print("Enter Job Title : ");
        String title = input.nextLine();
        System.out.print("Enter Start Date : ");
        String sDate = input.nextLine();
        System.out.print("Enter End Date : ");
        String eDate = input.nextLine();
        System.out.print("Enter Job Description : ");
        String description = input.nextLine();

        //applicant.setExpArr(exp);

        System.out.print("==Skills==\nEnter skill name : ");
        String skill = input.nextLine();
        System.out.print("Enter Competency Proficiency rating\n" +
                "(1=Fundamental, 2=Novice, 3=Intermediate, 4=Advanced, 5=Expert) : ");
        int proficiency = input.nextInt();

        Information inf = new Information();
        inf.setName(name);
        inf.setEmail(email);
        System.out.println(inf.getName() + inf.getEmail());
        Education edu = new Education(degree, major, university, graduation);
        Experience exp = new Experience(company, title, sDate, eDate, description);
        Skill ski = new Skill(skill, proficiency);

        applicant.setInfoArr(inf);
        applicantArr.add(applicant);


        /*for (Resume n : applicantArr) {
            System.out.println(n);
        }*/

        //applicant.setSkillArr(ski);

        //Resume applicant = new Resume()
        // printOut(applicantArr);
        //return"Applicant Name : " + inf.getName()+"\nEmail : "+ inf.getName();

        //return "";


    //private static void printOut(ArrayList<Resume> applicantArr); {
            System.out.println("============ RESUME ============");
            System.out.println();


            System.out.print("Applicant Name : " + applicant.getInfoArr(0));
            System.out.print("Email : " + applicant.getInfoArr(0));

            System.out.println("== Education ==\nDegree Type : " + applicant.getEduArr(0));
            System.out.println("Major : " + applicant.getEduArr(0));
            System.out.println("University Name : " + applicant.getEduArr(0));
            System.out.println("Graduation Year : " + applicant.getEduArr(0));


      //  }
    }
}

