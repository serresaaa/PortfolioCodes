//FEEL FREE TO COPY MY CODE ND TEST IT OUT ON THE ONLINE JAVA COMPILER LINK THAT IS IN MY WEBSITE! :D
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordersystem;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class OrderSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //CREATING SCANNER OBJECT
        Scanner sc = new Scanner (System.in);
        String input;
        
        while (true) {
        //DISPLAY THE MENU
        System.out.println("MENU");
        System.out.println("1. Americano\t\t - PHP 100");
        System.out.println("2. Cappucino\t\t - PHP 130");
        System.out.println("3. Cafe Mocha \t\t - PHP 150");
        System.out.println("4. Hot Chocolate \t - PHP 150");
        System.out.println("5. Exit");
        System.out.print("Enter the menu number of your choice: ");
        int order = sc.nextInt();

        
        //WHEN INPUT IS 5. EXIT
            if (order == 5) {
            System.out.println("Program closed. Thank you for visiting Cherries :D");
            break;
            }
            
        //WHEN INPUT IS INVALID
            if (order <= 0 || order > 4 ) {
            System.out.println("Invalid input. Please try again.");
            continue;
            }
        
        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt(); 
        
        if (quantity < 0) {
            System.out.println("Invalid input. Please try again.");
            continue;
        }
        
        int totalPrice = 0;

        
        // SWITCH STATEMENT AND TRACKING TOTAL BILL
        switch (order) {
            case 1: System.out.println("You ordered Americano.");
            totalPrice = 100 * quantity;
            break;
            case 2: System.out.println("You ordered Cappucino.");
            totalPrice = 130 * quantity;
            break;
            case 3: System.out.println("You ordered Cafe Mocha.");
            totalPrice = 150 * quantity;
            break;
            case 4: System.out.println("You ordered Hot Chocolate.");
            totalPrice = 150 * quantity;
            break;
            default: 
            break;
        }
        
        //OUTPUT THE FINAL TOTAL
        System.out.println("Total amount: " + totalPrice + " PHP");
        break;
        }
        
        sc.close();
        
    }
    
}
