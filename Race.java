/*
 * @author 3156908
 *
 * @version 1.0 07/26/2020
 *
 * Title: Files & Loops in a Car & CarRace Classes
 *
 * Semester: Summer 2020
 *
 * Lecturer's Name: C. Charters
 */

package challenge5_3156908;

import java.io.*;
import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author 3156908
 */

public class Race {
    
    static Car[] carArray1;
    static Car[] carArray2;
    
    
    public static void main(String[] args) throws IOException {
        
       createArraysOfCars();
       raceArrayOfCars();
    
    }
 
   /*
    * The createArraysofCars() method reads the value of winnerCarSet.txt and loserCarSet.txt
    * and stores their value in variables array1Size and array2Size respectively. It also
    * reads the files and then creates a car object and inludes it in carArray1 and carArray2.
    */
    
    static void createArraysOfCars() throws IOException {
        
        File fileA = new File ("winnerCarSet.txt");
        Scanner inFileOne = new Scanner(fileA);
        int array1Size = inFileOne.nextInt();
        
        carArray1 = new Car[array1Size];
        String model; 
        String make;
        int speed = 0;
        int year = 0;
        Car carA;
         
        int index = 0;
        
            while (inFileOne.hasNext() && index < array1Size) {
            
                year = inFileOne.nextInt();
                model = inFileOne.next();
                make = inFileOne.next();
                speed = inFileOne.nextInt();
                
                carA = new Car(year, model, make, speed);
                
                carArray1[index] = carA;
                
                index++;
            }
            
            inFileOne.close();
            
            File fileB = new File ("winnerCarSet.txt");
            Scanner inFileTwo = new Scanner(fileB);
            int array2Size = inFileTwo.nextInt();
            
            carArray2 = new Car[array2Size];
            Car carB;
            
            index = 0;
            
            while (inFileTwo.hasNext() && index < array2Size) {
                year = inFileTwo.nextInt();
                model =inFileTwo.next();
                make = inFileTwo.next();
                speed = inFileTwo.nextInt();
                
                carB = new Car(year, model, make, speed); 
                
                carArray2[index] = carB;
                
                index++;
            }
            
            inFileTwo.close();
    }
    
    /* 
     * The raceArraysOfCars() method, through a nested loop, compares the speed of each car
     * and then delcares the winner of the race by outputting the final winner of the race.
     */
    
    static void raceArrayOfCars() throws IOException {
        
      PrintWriter one = new PrintWriter ("winnerCarSet.txt");
      PrintWriter two = new PrintWriter ("loserCarSet.txt");
      
      one.println(carArray1.length);
      two.println(carArray2.length);
      
        System.out.println("Hello and welcome!");
        System.out.println("Get ready, get set, go!");
        System.out.println();
        
        
      
      for (int i = 0; i < carArray1.length; i++) {
          System.out.println();
          System.out.println("Car " + (i + 1) + " from group 1: " + carArray1[i]);
          System.out.println("Car " + (i + 1) + " from group 2: " + carArray2[i]);
          System.out.println();
          
          carArray1[i].setSpeed(0);
          carArray2[i].setSpeed(0);
          
          for (int laps = 1; laps <= 5; laps++) {
              System.out.println("Lap " + laps + " results ");
              carArray1[i].accelerate();
              carArray1[i].brake();
              System.out.println(carArray1[i].toString());
              
              carArray2[i].accelerate();
              carArray2[i].brake();
              System.out.println(carArray2[i].toString());
          }
            
              if (carArray1[i].getSpeed() > carArray2[i].getSpeed()) 
              {
                  System.out.println(carArray1[i].getYear() + " " + carArray1[i].getMake() + " " + carArray1[i].getModel() + " with a total speed of " + carArray1[i].getSpeed() + " mph.");
                  one.println(carArray1[i].getYear() + " " + carArray1[i].getMake() + " " + carArray1[i].getModel() + " " + carArray1[i].getSpeed());
                  
                  
                  System.out.println(carArray2[i].getYear() + " " + carArray2[i].getMake() + " " + carArray2[i].getModel() + " with a total speed of " + carArray2[i].getSpeed() + " mph.");
                  two.println(carArray2[i].getYear() + " " + carArray2[i].getMake() + " " + carArray2[i].getModel() + " " + carArray2[i].getSpeed());
                  
            } else {
                 System.out.println(carArray2[i].getYear() + " " + carArray2[i].getMake() + " " + carArray2[i].getModel() + " with a total speed of " + carArray2[i].getSpeed() + " mph.");
                 one.println(carArray2[i].getYear() + " " + carArray2[i].getMake() + " " + carArray2[i].getModel() + " " + carArray2[i].getSpeed());
                  
                  
                  System.out.println(carArray1[i].getYear() + " " + carArray1[i].getMake() + " " + carArray1[i].getModel() + " with a total speed of " + carArray1[i].getSpeed() + " mph.");
                  two.println(carArray1[i].getYear() + " " + carArray1[i].getMake() + " " + carArray1[i].getModel() + " " + carArray1[i].getSpeed());
            }          
         }
      
      one.close();
      two.close(); 
      
       }

  }
