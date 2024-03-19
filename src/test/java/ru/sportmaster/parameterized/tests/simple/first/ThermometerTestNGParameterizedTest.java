package ru.sportmaster.parameterized.tests.simple.first;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.sportmaster.parameterized.tests.Thermometer;

public class ThermometerTestNGParameterizedTest {

    @DataProvider
    public Object[][] provideTemperatures() {
        return new Object[][]{
                { 10 },
                { -2 },
                { -15 }
        };
    }

    @Test(dataProvider = "provideTemperatures")
    public void test(double temperature) {
        Thermometer thermometer = new Thermometer();

        Assert.assertTrue(thermometer.checkNeedToWearHat(temperature));
    }

}
