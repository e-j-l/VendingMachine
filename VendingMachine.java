//================================================
// Vending Machine
// Emmett Leary 
// Assignment 4
// February 18, 2026
//================================================

import java.util.Scanner;

public class VendingMachine {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Snack inventory: names and prices
        String[] snacks = {"Snickers", "Doritos", "M&Ms", "Cheetos", "Cheez-It"};
        double[] prices = {1.5, 1.25, 1.75, 1.5, 1.10}; 

        // Welsome messages 
        System.out.println("Welcome to the Vending Machine!");
        System.out.println("Here you can choose from a large variety of snacks.");
        System.out.println("Below are your snack options:");
        System.out.println();

        // Prints all snack options
        for (int i = 0; i < snacks.length; i++) { 
            System.out.println(String.format("%d: %s -- $%.2f", i + 1, snacks[i], prices[i]));
        }

        // Asks user to select and item and stores it 
        System.out.println("Which item would you like to choose (enter associated number)?");
        int choice = scanner.nextInt() - 1; // was having a indexing error so I subtracted 1 to fix the issue.
        System.out.println(String.format("You chose %s, which costs $%.2f", snacks[choice], prices[choice]
        ));

        // Asks user to add money and stores info
        System.out.println("Please add an ammount of money to machine to continue.");
        double money = scanner.nextDouble();

        // checks to make sure enough money was added and either fails or completes purchase and prints change
        if(money < prices[choice]) {
            System.out.println("Not enough money. Please try again."); // was curious if there was a way to send the user back a step

        } else {
            double change = money - prices[choice];
            System.out.println(String.format("Purchase complete. \nChange: %.2f", change));
        }
    }
}
