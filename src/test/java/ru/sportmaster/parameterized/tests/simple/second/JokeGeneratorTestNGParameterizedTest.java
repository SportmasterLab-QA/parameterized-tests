package ru.sportmaster.parameterized.tests.simple.second;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.sportmaster.parameterized.tests.JokeGenerator;

public class JokeGeneratorTestNGParameterizedTest {

    @DataProvider
    public Object[][] provideJokeData() {
        return new Object[][]{
                {"батин юмор", "- Батя, я голоден! - Привет, Голоден, я - Батя!"},
                {"dev", "Я программист простой: если задача простая, то мне скучно, а если сложная — трудно и страшно, что не получится сделать"},
                {"ученые шутят", "Заходит как-то в бар бесконечно количество математиков, а бармен им: - 'А ну пошли вон отсюда!'"},
                {"про Java", "Тип шутки не поддерживается"}
        };
    }

    @Test(dataProvider = "provideJokeData")
    public void test(String jokeType, String expectedJoke) {
        String joke = JokeGenerator.getJoke(jokeType);

        Assert.assertEquals(joke, expectedJoke);
    }

}
