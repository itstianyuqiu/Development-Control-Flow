package ictgradschool.industry.lab_controlflow.ex04;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExerciseFour {
    private ExerciseFour cr;

    @Before
    public void setup() {
        cr = new ExerciseFour();
    }

    @Test
    public void testGetGenderMale() {
        assertEquals("Male", cr.getGender('M'));
        assertEquals("Male", cr.getGender('m'));
    }

    @Test
    public void testGetGenderFemale() {
        assertEquals("Female", cr.getGender('F'));
        assertEquals("Female", cr.getGender('f'));
    }

    @Test
    public void testGetGenderUnknown() {
        assertEquals("Unknown", cr.getGender('x'));
        assertEquals("Unknown", cr.getGender('9'));
    }}
