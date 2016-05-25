package com.crooks;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static final String FILE_NAME = "eveDetails.json";


    public static void main(String[] args) {
        String filename = FILE_NAME;

        Player p1 = loadInfo(filename);

        if (p1 != null) {System.out.println( p1.toString());}
        else{
            p1 = new Player();
        }

        System.out.println("Eve Online Information Session.\n Thank you for taking the time to talk with us\n");

        System.out.println("Let's start with the basics, Whats your name?");
        p1.name = scanner.nextLine();

        System.out.println("Who do you Currently work for?");
        p1.corp = scanner.nextLine();

        System.out.println("How much money do you currently Have saved up?");
        p1.wallaetBallance = scanner.nextLine();

        System.out.println("What type of ship are you flying currently?");
        p1.shipname = scanner.nextLine();

        System.out.println("What system are you currently living in?");
        p1.stagingSystem = scanner.nextLine();

        saveInfo(filename, p1);

    }

    public static void saveInfo(String filename, Player p1){
        JsonSerializer serial = new JsonSerializer();
        String json = serial.include("*").serialize(p1);
        File f = new File(filename);

        try {
            FileWriter fw = new FileWriter(f);
            fw.write(json);
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("There was a problem saving your file...");
        }
        System.out.println("Your Responses have been saved, \nThank you For participating.");
    }

    public static Player loadInfo(String filename){
        File f = new File(filename);
        try {
            Scanner scanner = new Scanner(f);
            scanner.useDelimiter("\\z");
            String guts = scanner.next();
            JsonParser parser = new JsonParser();
            return parser.parse(guts, Player.class);
        } catch (FileNotFoundException e) {
        }
        return null;

    }
}
