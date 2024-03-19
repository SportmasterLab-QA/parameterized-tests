package ru.sportmaster.parameterized.tests.simple.second;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.sportmaster.parameterized.tests.JokeGenerator;

public class JokeGeneratorTest {

    @Test
    public void test1() {
        String joke = JokeGenerator.getJoke("батин юмор");
        String expectedJoke = "- Батя, я голоден! - Привет, Голоден, я - Батя!";

        Assert.assertEquals(joke, expectedJoke);
    }

    @Test
    public void test2() {
        String joke = JokeGenerator.getJoke("dev");
        String expectedJoke = "Я программист простой: если задача простая, то мне скучно, а если сложная — трудно и страшно, что не получится сделать";

        Assert.assertEquals(joke, expectedJoke);
    }

    @Test
    public void test3() {
        String joke = JokeGenerator.getJoke("ученые шутят");
        String expectedJoke = "Заходит как-то в бар бесконечно количество математиков, а бармен им: - 'А ну пошли вон отсюда!'";

        Assert.assertEquals(joke, expectedJoke);
    }

    @Test
    public void test4() {
        String joke = JokeGenerator.getJoke("про Java");
        String expectedJoke = "Тип шутки не поддерживается";

        Assert.assertEquals(joke, expectedJoke);
    }

}
