package com.ubs.opsit.interviews;

/**
 * Created by Prasad on 20-08-2018.
 */
public class BerlinClockTimeConverter implements TimeConverter {
    @Override
    public String convertTime(String aTime) {
        if(aTime==null)
            throw new IllegalArgumentException();

        return BerlinClock.constructBerlinClock(aTime).toString();
    }
}
