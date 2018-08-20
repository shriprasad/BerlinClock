package com.ubs.opsit.interviews.junit;

import com.ubs.opsit.interviews.BerlinClockTimeConverter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Prasad on 20-08-2018.
 */
public class FiveHourLampTest {

    @Test
    public void testPrintClock() {
        String output= new BerlinClockTimeConverter().convertTime("12:30:30");

        String expected =  String.join("\r\n","Y","RROO","RROO","YYRYYROOOOO","OOOO");

        assertEquals(expected, output);
    }

}
