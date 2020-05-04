package ictgradschool.industry.lab_controlflow.ex06;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class TestExerciseSix {
    private ExerciseSix cr;

    @Before
    public void setup() {
        cr = new ExerciseSix();
    }

    private ByteArrayOutputStream outContent;

    @Before
    public void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void testPrintRowOfAmpersandsOne() {
        cr.printRowOfAmpersands(1);
        assertEquals("&", outContent.toString().trim());
    }

    @Test
    public void testPrintRowOfAmpersandsFive() {
        cr.printRowOfAmpersands(5);
        assertEquals("&&&&&", outContent.toString().trim());
    }

    @Test
    public void testPrintRowOfAmpersandsTen() {
        cr.printRowOfAmpersands(10);
        assertEquals("&&&&&&&&&&", outContent.toString().trim());
    }
}
