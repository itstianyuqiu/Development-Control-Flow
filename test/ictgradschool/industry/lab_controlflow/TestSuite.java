package ictgradschool.industry.lab_controlflow;

import ictgradschool.industry.lab_controlflow.ex03.TestExerciseThree;
import ictgradschool.industry.lab_controlflow.ex04.TestExerciseFour;
import ictgradschool.industry.lab_controlflow.ex06.TestExerciseSix;
import ictgradschool.industry.lab_controlflow.ex08.TestExerciseEight;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestExerciseThree.class,
        TestExerciseFour.class,
        TestExerciseSix.class,
        TestExerciseEight.class,
        TestExerciseEight.class})
public class TestSuite {}
