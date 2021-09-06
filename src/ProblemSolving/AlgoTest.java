package ProblemSolving;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AlgoTest {
    @Test
    public void twelveClockPMTest(){
        Assertions.assertEquals("12:01:00", Algo.timeConversion("12:01:00PM"));
    }

    @Test
    public void twerlveClockAMTest(){
        Assertions.assertEquals("00:01:00", Algo.timeConversion("12:01:00AM"));
    }
}
