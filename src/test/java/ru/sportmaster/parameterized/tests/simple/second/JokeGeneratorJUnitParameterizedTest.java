package ru.sportmaster.parameterized.tests.simple.second;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import ru.sportmaster.parameterized.tests.JokeGenerator;

import java.util.stream.Stream;

public class JokeGeneratorJUnitParameterizedTest {

    private static Stream<Arguments> provideStringsForIsBlank() {
        return Stream.of(
                Arguments.of("батин юмор", "- Батя, я голоден! - Привет, Голоден, я - Батя!"),
                Arguments.of("dev", "Я программист простой: если задача простая, то мне скучно, а если сложная — трудно и страшно, что не получится сделать"),
                Arguments.of("ученые шутят", "Заходит как-то в бар бесконечно количество математиков, а бармен им: - 'А ну пошли вон отсюда!'"),
                Arguments.of("про Java", "Тип шутки не поддерживается")
        );
    }

    @ParameterizedTest
    @MethodSource("provideStringsForIsBlank")
    public void test(String jokeType, String expectedJoke) {
        String joke = JokeGenerator.getJoke(jokeType);

        Assert.assertEquals(joke, expectedJoke);
    }

}
