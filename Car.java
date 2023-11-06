/*
 * @author XXXXX08
 *
 * @version 1.0 07/26/2020
 *
 * Title: Files & Loops in a Car & CarRace Classes
 *
 * Semester: Summer 2020
 *
 * Lecturer's Name: C. Charters
 */

package CarRaceSimulator;

/**
 *
 * @author 3156908
 */

import java.util.Random;

public class Car {
    
    private int year;
    private String model;
    private String make;
    private int speed;
    
    public Car() {
        this.year = 2017;
        this.model = "Nissan";
        this.make = "Sentra";
        this.speed = 60;
    }
    
    //Main constructor.
    
    public Car (int year, String model, String make, int speed){
        this.year = year;
        this. model = model;
        this.make = make;
        this.speed = speed;
    
    
    }
    
    // Getters and Setters.

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String toString() {
        
        return year + " " + make + " " + model + " " + speed;
    }
    
 public void accelerate() {
     Random rand = new Random();
     speed = speed + rand.nextInt(70 - 5 + 1) + 5;
 }
 
 public void brake() {
     Random rand = new Random();
     speed = speed - rand.nextInt(30 - 5 + 1) + 5;
 }
 
}
