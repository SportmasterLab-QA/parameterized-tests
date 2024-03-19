package ru.sportmaster.parameterized.tests.simple.second;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.sportmaster.parameterized.tests.JokeGenerator;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JokeGeneratorTestNGFileParameterizedTest {

    @DataProvider
    public Object[][] provideJokeData() throws IOException {
        String path = "joke-test-data.csv";

        List<Object[]> testData = new ArrayList<>();

        try (Reader reader = Files.newBufferedReader(Paths.get(path));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT)) {
            for (CSVRecord csvRecord : csvParser) {
                testData.add(new Object[]{csvRecord.get(0), csvRecord.get(1)});
            }
        }
        return testData.toArray(new Object[0][0]);
    }

    @Test(dataProvider = "provideJokeData")
    public void test(String jokeType, String expectedJoke) {
        String joke = JokeGenerator.getJoke(jokeType);

        Assert.assertEquals(joke, expectedJoke);
    }

}
