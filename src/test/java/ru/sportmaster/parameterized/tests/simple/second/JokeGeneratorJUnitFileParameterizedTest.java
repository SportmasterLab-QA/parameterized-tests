package ru.sportmaster.parameterized.tests.simple.second;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.Assert;
import ru.sportmaster.parameterized.tests.JokeGenerator;

import java.util.stream.Stream;

public class JokeGeneratorJUnitFileParameterizedTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/joke-test-data.csv")
    public void test(String jokeType, String expectedJoke) {
        String joke = JokeGenerator.getJoke(jokeType);

        Assertions.assertEquals(expectedJoke, joke);
    }

}
