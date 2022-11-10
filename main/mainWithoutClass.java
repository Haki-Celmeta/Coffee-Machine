package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int disposableCups = 9;
    static int money = 550;

    public static void main(String[] args) {
        boolean flag = false;
        String action;
        while(!flag){
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.nextLine().toLowerCase();
            switch(action){
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    flag = true;
                    break;
            }
        }
    }

    public static void coffeeMachine(){
        System.out.println("""
                Starting to make a coffee
                Grinding coffee beans
                Boiling water
                Mixing boiled water with crushed coffee beans
                Pouring coffee into the cup
                Pouring some milk into the cup
                Coffee is ready!""");
    }

    public static void remaining(){
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water " + "\n" +
                milk + " ml of milk " + "\n" +
                coffeeBeans + " g of coffee beans" + "\n" +
                disposableCups + " disposable cups" + "\n" +
                "$" + money + " of money");
    }

    public static void fill(){
        System.out.println("Write how many ml of water you want to add:");
        int addWater = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        int addMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int addCoffeeBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        int addDisposableCups = scanner.nextInt();

        water += addWater;
        milk += addMilk;
        coffeeBeans += addCoffeeBeans;
        disposableCups += addDisposableCups;
    }

    public static void buy(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String input = scanner.nextLine();
        switch(input){
            case "1":
                if(water < 250){
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (coffeeBeans < 16){
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                } else if (disposableCups == 0){
                    System.out.println("Sorry, not enough diposable cups!");
                    break;
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 250;
                    coffeeBeans -= 16;
                    disposableCups -= 1;
                    money += 4;
                    break;
                }
            case "2":
                if(water < 350){
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (milk < 75){
                    System.out.println("Sorry, not enough milk!");
                    break;
                } else if (coffeeBeans < 20){
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                } else if (disposableCups == 0){
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 350;
                    milk -= 75;
                    coffeeBeans -= 20;
                    disposableCups -= 1;
                    money += 7;
                    break;
                }
            case "3":
                if(water < 200){
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (milk < 100){
                    System.out.println("Sorry, not enough milk!");
                    break;
                } else if (coffeeBeans < 12){
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                } else if (disposableCups == 0){
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                } else {
                    water -= 200;
                    milk -= 100;
                    coffeeBeans -= 12;
                    disposableCups -= 1;
                    money += 6;
                    break;
                }
            case "back":
                break;
        }
    }

    public static void take(){
        System.out.println("I gave you $" + money);
        money = 0;
    }
}
