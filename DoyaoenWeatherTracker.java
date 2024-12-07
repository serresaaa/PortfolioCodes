//FEEL FREE TO COPY MY CODE ND TEST IT OUT ON THE ONLINE JAVA COMPILER LINK THAT IS IN MY WEBSITE! :D
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doyaoenweathertracker;

/**
 *
 * @author Lenovo
 */

//Import scanner object
import java.util.Scanner;

public class DoyaoenWeatherTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Syntax declaration and initialization
            double temp[][] = new double[3][7];
        
        //Loops and printing
            for (int i = 0; i < temp.length; i++) {
            System.out.println("CITY " + (i+1) + "");
            for (int j = 0; j < temp[i].length; j++) {
                System.out.print("Temperature for Day " + (j+1) + ": ");
                
        //Getting temperature input
            double inputTemp = sc.nextDouble();
            
        //Case handling: Input must not be less than -50 nor greater than 50
            if (inputTemp < -50 || inputTemp > 50) {
                System.out.println("Invalid value. Input must be at least -50 and a maximum of 50. Please try again.");
                j--; //returns to the Day where input was invalid so that user can input a valid answer.
            }
            else {
                temp[i][j] = inputTemp; //if input is correct, it is stored in varible temp[i][j]
            }
            }
        }
            
        //Getting the average temperature for each city
            for (int i = 0; i < temp.length; i++) {
                double sum = 0; //initializes that variable sum is 0.
                double highest = temp[i][0]; //starts with the first input as the highest temperature in each city and compares the next input to this one until the user inputs a value higher than current highest value
                double lowest = temp[i][0]; //starts with the first input as the lowest temperature in each city and compares the next input to this one until the user inputs a value lower than the current lowest value
                
            
        //Calculate the sum of temperatures of each city
            for (int j = 0; j < temp[i].length; j++) {
                sum += temp[i][j]; //sum+= means it adds up all the values of temp[i][j] and stores it in variable sum.
            
        //Find the highest temperature
            if (temp[i][j] > highest) { //compares if the user input is higher than the current highest value
                highest = temp[i][j]; //if true, highest value out of all the inputted data (temp[i][j] is stored in variable highest
            }
            
        //Find the lowest temperature
            if (temp[i][j] < lowest) { //compares if the user input is lower than the current lowest value
                lowest = temp[i][j]; //if true, lowest value out of all the inputted data (temp[i][j] is stored in variable lowest
            }
            
        }
        
        //Calculate the average temoerature for each city
            double averageTemp = sum / temp[i].length; 
            
        //Printing of average, highest, and lowest temperature of each city
        System.out.printf("Average temperature for City %d: %.1f\t\nHighest temperature for City %d: %.1f\t\nLowest Temperature for City %d: %.1f\t\t\n", (i+1), averageTemp, (i+1), highest, (i+1), lowest); 

    }
            
    // Close scanner
    sc.close();
    
}
}
