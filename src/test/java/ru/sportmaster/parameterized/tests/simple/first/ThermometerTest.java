package ru.sportmaster.parameterized.tests.simple.first;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.sportmaster.parameterized.tests.Thermometer;

public class ThermometerTest {

    @Test
    public void test1() {
        Thermometer thermometer = new Thermometer();
        double temperature = 10.0;

        Assert.assertTrue(thermometer.checkNeedToWearHat(temperature));
    }

    @Test
    public void test2() {
        Thermometer thermometer = new Thermometer();
        double temperature = -2.0;

        Assert.assertTrue(thermometer.checkNeedToWearHat(temperature));
    }

    @Test
    public void test3() {
        Thermometer thermometer = new Thermometer();
        double temperature = -15.0;

        Assert.assertTrue(thermometer.checkNeedToWearHat(temperature));
    }

}
