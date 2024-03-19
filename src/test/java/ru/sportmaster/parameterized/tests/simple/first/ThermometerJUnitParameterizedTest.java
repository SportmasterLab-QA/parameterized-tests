package ru.sportmaster.parameterized.tests.simple.first;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.testng.Assert;
import ru.sportmaster.parameterized.tests.Thermometer;

public class ThermometerJUnitParameterizedTest {

    @ParameterizedTest
    @ValueSource(doubles = {10.0, -2.0, -15.0})
    public void test(double temperature) {
        Thermometer thermometer = new Thermometer();

        Assert.assertTrue(thermometer.checkNeedToWearHat(temperature));
    }

}
