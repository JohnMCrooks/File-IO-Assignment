package com.crooks;

/**
 * Created by johncrooks on 5/25/16.
 */
public class Player {
    String name;
    String corp;
    String wallaetBallance;
    String shipname;
    String stagingSystem;

    public Player() {
    }

    public Player(String name, String corp, String wallaetBallance, String shipname, String stagingSystem) {
        this.name = name;
        this.corp = corp;
        this.wallaetBallance = wallaetBallance;
        this.shipname = shipname;
        this.stagingSystem = stagingSystem;
    }

    public String getName() {
        return name;
    }

    public String getCorp() {
        return corp;
    }

    public String getWallaetBallance() {
        return wallaetBallance;
    }

    public String getShipname() {
        return shipname;
    }

    public String getStagingSystem() {
        return stagingSystem;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", corp='" + corp + '\'' +
                ", wallaetBallance=" + wallaetBallance +
                ", shipname='" + shipname + '\'' +
                ", stagingSystem='" + stagingSystem + '\'' +
                '}';
    }
}
