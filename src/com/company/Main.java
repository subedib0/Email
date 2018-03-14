package com.company;
//Project 1
// Email Application
// Scenario: You are an IT Support Administrator Specialist and are charged with the Task of creating email accounts for new hires
//Your application should do the following
//Generate an email with the following syntax: firstname.lastname@department.company.com
// Determine the department ( sales, development, accounting), if none leave blank
//. Generate a random String for password
//. Have set Methods to change the password, set the mailbox capacity, and define an alternate email address
//. have get Methods to display the name, email, and mailbox capacity
public class Main {

    public static void main(String[] args) {

        email em1=new email("john", "smith");
        System.out.println(em1.showInfo());
//        em1.setAlternateEmail("js@gmail.com");
//        System.out.println(em1.getAlternateEmail());

	// write your code here
    }
}
