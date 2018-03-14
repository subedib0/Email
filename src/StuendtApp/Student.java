package StuendtApp;

import java.util.Scanner;

public class Student {


    private String firstName;
    private String lastName;
    private int gradeyear;
    private String studentID;
    private String courses;
    private int tuitionBalance=0;
    private static int costOfCourse = 600;
    private static int id = 1000;
// constructor: prompt user to enter student's name and year

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter Student last name: ");
        this.lastName = in.nextLine();

        System.out.print(" 1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\n Enter Student Class level: ");
        this.gradeyear = in.nextInt();
        setstudentID();

        //commenting the infor that we do not need to see
//        System.out.println(firstName + " " + lastName + " " + gradeyear +" "+ studentID);


    }


    //Generate an ID


      private void setstudentID() {
        //grade level +ID
        id++;
        this.studentID = gradeyear + "  " + id;

    }

    //Enroll in courses

    public void enroll(){

        //Get inside the loop user hits 0
       do{ System.out.println("Enter Course to enroll(Q to quit): ");
        Scanner in = new Scanner(System.in);
        String course= in.nextLine();
        if (!course.equals("Q") ){
            courses = courses +"\n" + course;
            tuitionBalance=tuitionBalance+costOfCourse;
        }
        else {
            System.out.println("Break!");
            break;
        }
        }
        while (1 != 0);

        //commenting the infor that we do not need to see

//        System.out.println("Enrolled IN: "+ courses);
//        System.out.println("TUITION BALANCE: "+ tuitionBalance);
    }

    //view balance
    public void viewBalance(){

        System.out.println("Your balance is: $"+tuitionBalance);
    }
    // pay Tuition
    public void payTuition(int payment){
        viewBalance();
        System.out.println("Enter Your Payment: $");
        Scanner in = new Scanner(System.in);
         payment=in.nextInt();
        tuitionBalance =tuitionBalance-payment;
        System.out.println("Thank you for your Payment of $" +payment);
        viewBalance();
    }
    // show Status
    public String toString(){
        return "Name: "+ firstName +" "+ lastName +
                "\n Grade Level: "+ gradeyear +
                "\nStudent ID: "+studentID+
                "\nCourses Enrolled:"+courses +
                "\nBalance: $" + tuitionBalance;

    }



}
