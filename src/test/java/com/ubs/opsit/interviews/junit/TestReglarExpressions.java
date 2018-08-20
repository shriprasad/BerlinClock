package com.ubs.opsit.interviews.junit;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

/**
 * Created by Prasad on 20-08-2018.
 */
public class TestReglarExpressions {
    String group1="(\\d{1,2}|0\\d{1,2}|1\\d{0,2}|2[0-5]{0,2})";

    String ipAddressPattern="^"+group1+"[\\.]"+group1+"[\\.]"+group1;


    @Test
    public void testValidIPAddress()
    {
        Pattern pattern= Pattern.compile(ipAddressPattern);
        Matcher m= pattern.matcher("000.255.34");
        assertEquals(true,m.matches());
        m=pattern.matcher("93.4.195");
        assertEquals(true,m.matches());





    }

}
