package StuendtApp;
//Project 2
// Student Database Application
// Scenario: you are a Database Administrator for a university and need to create an application to manage student enrollments and balance.
// Your application should do following:
//. Ask the ise r how many new students will be added to the database
//. The user should be prompted to enter the name and year for each student
//. The Student should have a 5- digit unique ID, with the first number being their grade level
//.A student can enroll in the ffollowing courses:
//  History101
//  Mathmatic 101
//  Chemistry 101
//  Computeer Science 101
//.  Each course costs $600 to enroll
// . The Student should be able to view thier balance and pay the tuition
// . To see the status of the student, we should see their name, ID, courses enrolled, and balance


import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
//        Student stu1 =new Student();
//        stu1.enroll();
//        stu1.payTuition(500);
//        System.out.println(stu1.toString());
        //Ask how many new students we want to add
//        Student stu2 =new Student();
//        stu2.enroll();
//        stu2.payTuition(500);
//        System.out.println(stu2.toString());
//
//        Student stu3 =new Student();
//        stu3.enroll();
//        stu3.payTuition(500);
//        System.out.println(stu3.toString());
        //Ask how many new students we want to add at once instead keep adding
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner((System.in));
        int numOfStudents = in.nextInt();
        Student[]students =new Student[numOfStudents];

        //create n number of few students
        for(int n =0; n< numOfStudents; n++){
            students[n]=new Student();
            students [n].enroll();
            students[n].payTuition(0);

//            System.out.println((students[0].toString()));
//            System.out.println((students[0].toString()));
        }
        for(int n =0; n< numOfStudents; n++){
            System.out.println((students[n].toString()));
        }
    }
}
