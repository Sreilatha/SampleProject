package com.srilatha;

import org.junit.Assert;
import org.junit.Test;

public class LifeTest {

    @Test
    public void testToddler()
    {
        String text = new Calculator().ageToText(12);
        Assert.assertEquals( "Toddler", text);
    }

    @Test
    public void testBaby()
    {
        String text = new Calculator().ageToText(1);
        Assert.assertEquals( "Baby", text);
    }

    @Test
    public void testAdult()
    {
        String text = new Calculator().ageToText(-1);
        Assert.assertEquals( null, text);
    }

    @Test
    public void testTeen()
    {
        String text = new Calculator().ageToText(13);
        Assert.assertEquals( "Teen", text);
    }

    @Test
    public void testlowerboundry()
    {
        String text = new Calculator().ageToText(0);
        Assert.assertEquals( "Baby", text);
    }

    @Test
    public void testlowerboundryToddler()
    {
        String text = new Calculator().ageToText(2);
        Assert.assertEquals( "Baby", text);
    }

}
