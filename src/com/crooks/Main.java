package com.crooks;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Player p1 = new Player();

        System.out.println("Eve Online Information Session.\n Thank you for taking the time to talk with us\n");

        System.out.println("Let's start with the basics, Whats your name?");
        p1.name = scanner.nextLine();

        System.out.println("Who do you Currently work for?");
        p1.corp = scanner.nextLine();

        System.out.println("How much money do you currently Have saved up?");
        p1.wallaetBallance = scanner.nextInt();

        System.out.println("What type of ship are you flying currently?");
        p1.shipname = scanner.nextLine();

        System.out.println("What system are you currently living in?");
        p1.stagingSystem = scanner.nextLine();


    }

    public static void saveInfo(){

    }
}
