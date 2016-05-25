package com.crooks;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by johncrooks on 5/25/16.
 */
public class MainTest {

    @Test
    public void saveAndLoad(){
        String fileinput = "eveDetails.json";
        Player pt = new Player("test","test","test","test","last");

        Main.saveInfo(fileinput, pt);

        Player pl = Main.loadInfo(fileinput);

        assertTrue(pl != null);
        assertTrue(pl.name.equals(pt.name));
        assertTrue(pl.corp.equals(pt.corp));
        assertTrue(pl.shipname.equals(pt.shipname));

    }
}