package ru.sportmaster.parameterized.tests.simple.first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.sportmaster.parameterized.tests.Thermometer;

public class ThermometerJUnitParameterizedTest {

    @ParameterizedTest
    @ValueSource(doubles = {10.0, -2.0, -15.0})
    public void test(double temperature) {
        Thermometer thermometer = new Thermometer();

        Assertions.assertTrue(thermometer.checkNeedToWearHat(temperature));
    }

}
