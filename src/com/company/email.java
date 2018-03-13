package com.company;

import java.util.Scanner;

public class email {

    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private int mailboxCapacity =500;
    private int defaultPasswordLength=10;
    private String alternateEmail;
    private String companySuffix ="aeycompany.com";

    //create constructor to ask for the First Name ad Last Name


    public email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//        System.out.println("email Created: " + this.firstName + " " + this.lastName);
        //Call the method asking for the department and return the department

        this.department = setDepartment();
        System.out.println("Department: " + this.department);
        //call a method that rreturn a random password
        this.password=randomPassword(defaultPasswordLength);
        System.out.println("your passwword is :" + this.password);

        //combine element to generate the email
        email=firstName.toLowerCase()+"." +lastName.toLowerCase()+ "@"+department+"." +companySuffix;
//        System.out.println("Your email is: "+email);
    }

    //Ask for the department

    private String setDepartment() {
        System.out.print("New Worker: "+firstName+ " DEPARTMENT CODE\n 1 for sales\n2 for development\n3 for accounting\nEnter the Department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";

        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "";
        }

    }


    //generate the random password
private String randomPassword (int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
        char[]password = new char[length];
        for (int i= 0; i<length; i++){
           int rand= (int)   (Math.random()* passwordSet.length());
           password[i]=passwordSet.charAt(rand);

        }
        return new String(password);
}
    //set the mailbox cpacity

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    //set the ulternet email

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    //change the password


    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;

    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo(){
        return "Display name: "+firstName+" "+lastName+ "\nCompany Email: " +email+ "\nMailbox Capacity: "+ mailboxCapacity+"mb";
    }
}