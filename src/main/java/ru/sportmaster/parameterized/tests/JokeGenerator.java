package ru.sportmaster.parameterized.tests;

public class JokeGenerator {

    public static String getJoke(String humorType) {
        switch (humorType) {
            case "батин юмор":
                return "- Батя, я голоден! - Привет, Голоден, я - Батя!";
            case "dev":
                return "Я программист простой: если задача простая, то мне скучно, а если сложная — трудно и страшно, что не получится сделать";
            case "ученые шутят":
                return "Заходит как-то в бар бесконечно количество математиков, а бармен им: - 'А ну пошли вон отсюда!'";
            default:
                return "Тип шутки не поддерживается";
        }
    }

}
