package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int cups = 9;
    static int money = 550;
    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner2 = new Scanner(System.in);


    public static void main(String[] args) {
        start();

    }


    public static void start() {
        boolean isOn = true;
        while (isOn) {

            System.out.println("Write action ( buy, fill, take, remaining, exit): ");

                String choice = scanner.next();
                switch (choice) {
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
                        isOn = false;
                        break;


                }





        }


    }

    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:  ");

        String stringChoice = scanner2.next();

        if (stringChoice.equals("1")) {

            if (water - 250 >= 0 && coffeeBeans - 16 >= 0 && cups - 1 >= 0) {
                System.out.println("I have enough resources, making you a coffee!");
                water = water - 250;
                coffeeBeans = coffeeBeans - 16;
                money = money + 4;
                cups = cups - 1;

            } else if (water - 250 < 0) {
                System.out.println("Sorry, not enough water!");
            } else if (coffeeBeans - 16 < 0) {
                System.out.println("Sorry, not enough coffee beans!");
            } else if (cups - 1 < 0) {
                System.out.println("Sorry, not enough cups off coffee!");
            }
        }


        if (stringChoice.equals("2")) {
            if (water - 350 >= 0 && milk - 75 >= 0 && coffeeBeans - 20 >= 0 && cups - 1 >= 0) {
                System.out.println("I have enough resources, making you a coffee!");
                water = water - 350;
                milk = milk - 75;
                coffeeBeans = coffeeBeans - 20;
                money = money + 7;
                cups = cups - 1;

            } else if (water - 350 < 0) {
                System.out.println("Sorry, not enough water!");
            } else if (milk - 75 < 0) {
                System.out.println("Sorry, not enough milk!");
            } else if (coffeeBeans - 20 < 0) {
                System.out.println("Sorry, not enough coffee beans!");
            } else if (cups - 1 < 0) {
                System.out.println("Sorry, not enough cups off coffee!");
            }
        }


        if (stringChoice.equals("3")) {
            if (water - 200 >= 0 && milk - 100 >= 0 && coffeeBeans - 12 >= 0 && cups - 1 >= 0) {
                System.out.println("I have enough resources, making you a coffee!");
                water = water - 200;
                milk = milk - 100;
                coffeeBeans = coffeeBeans - 12;
                money = money + 6;
                cups = cups - 1;

            } else if (water - 200 < 0) {
                System.out.println("Sorry, not enough water!");
            } else if (milk - 100 < 0) {
                System.out.println("Sorry, not enough milk!");
            } else if (coffeeBeans - 12 < 0) {
                System.out.println("Sorry, not enough coffee beans!");
            } else if (cups - 1 < 0) {
                System.out.println("Sorry, not enough cups off coffee!");
            }
        }

        if (stringChoice.equals("back")) {

        }


    }


    public static void fill() {
        System.out.println("Write how many ml of water do you want to add: ");
        int addWater = scanner.nextInt();
        water = water + addWater;
        System.out.println("Write how many ml of milk do you want to add: ");
        int addmilk = scanner.nextInt();
        milk = milk + addmilk;
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        int addBeans = scanner.nextInt();
        coffeeBeans = coffeeBeans + addBeans;
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        int addCups = scanner.nextInt();
        cups = cups + addCups;


    }

    public static void take() {
        System.out.println("I gave you $" + money);
        money = 0;

    }

    public static void remaining() {
        System.out.println("The coffee machine has: ");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");

    }


}
