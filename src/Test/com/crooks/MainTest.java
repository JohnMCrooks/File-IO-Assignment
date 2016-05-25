package com.crooks;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by johncrooks on 5/25/16.
 */
public class MainTest {
    public static final String TEST_FILE = "test.json";

    @Test
    public void saveAndLoad(){
        Player pt = new Player("test","test","test","test","last");
        Main.saveInfo(TEST_FILE, pt);

        Player pl = Main.loadInfo(TEST_FILE);
        File f = new File(TEST_FILE);

        assertTrue(pl != null);
        assertTrue(pl.name.equals(pt.name));
        assertTrue(pl.corp.equals(pt.corp));
        assertTrue(pl.shipname.equals(pt.shipname));

    }
}