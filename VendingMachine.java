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
        int[] prices = {1, 3, 2, 3, 2}; 

    }
}
