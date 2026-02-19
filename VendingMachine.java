//================================================
// Vending Machine
// Emmett Leary 
// Assignment 4
// February 18, 2026
//================================================

import java.util.Scanner;

public class VendingMachine {
    
    static class Snack {
        String name;
        int price; //in dollars

        Snack(String name, int price) {
            this.name = name;
            this.price = price;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Snack inventory: names and prices
        String[] snacks = {"Snickers", "Doritos", "M&Ms", "Cheetos", "Cheez-It"};
        double[] prices = {1.5, 1.25, 1.75, 1.5, 1.10}; 

        System.out.println("Welcome to the Vending Machine!");
        System.out.println("Here you can choose from a large variety of snacks.");
        System.out.println("Below are your snack options:");
        System.out.println();

        for (int i = 0; i < snacks.length; i++) {
            System.out.println(String.format("%d: %s -- $%.2f", i + 1, snacks[i], prices[i]));
        }

        System.out.println("Which item would you like to choose (enter associated number)?");
        int choice = scanner.nextInt();
        System.out.println(String.format("You chose %s, which costs $%.2f", snacks[choice], prices[choice]));
    }
}
