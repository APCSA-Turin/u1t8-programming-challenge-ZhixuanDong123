package com.example.project;

public class Student {
    // INSTANCE VARIABLES (private)
    // first name (String)
    // last name (String)
    // graduation year (int)
    // sum of test scores (double).. should initialize at 0.0
    // test score count (int) ..should initialize at 0
    // highest test score (double).. should initialize at 0.0
    private String firstName;
    private String lastName;
    private int gradYear;
    private double sumTests;
    private int numTests;
    private double highestTest;
    // constructor
    public Student(String firstName, String lastName, int gradYear) {
        //implement code here!
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        this.numTests = 0;
        this.sumTests = 0.0;
        this.highestTest = 0.0;

    }
 
    // returns firstName
    public String getFirstName() {
        //implement code here!
        return firstName;
    }
 
    // returns lastName
    public String getLastName() {
        //implement code here!
        return lastName;
    }
 
    public double getHighestTestScore() {
        //implement code here!

        return highestTest; //random double number
    }

    public int getTestScoreCount(){
        //implement code here!
        return numTests;
    }

    public int getGradYear(){
        //implement code here!
        return gradYear;
    }
 
    // sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        //implement code here!
        this.gradYear = newGradYear;
    }
 
    // adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    // set new highest test score 
    public void addTestScore(double newTestScore) {
        //implement code here!
        this.numTests++;
        this.sumTests += newTestScore;
        this.highestTest = newTestScore;


    }
 
    // returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        if (averageTestScore() > 65) {
            return true;
        }
        return false;
    }
 
    // returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        //implement code here!
        
        return sumTests/numTests; //random double number
    }
 
    // this method prints all info of a Student object to the console 
    // I AM NOT TESTING YOU ON THIS METHOD. IT'S FOR YOUR TESTING PURPOSES ONLY.. you don't have to use it
    public void printStudentInfo() {
        System.out.println("Student Full Name: " );
        System.out.println("Graduation Year: ");
        System.out.println("Number of tests: ");
        System.out.println("Average Test Score: ");
        System.out.println("Highest Test Score: ");
        System.out.println("Is passing: ");
    }
 }
 