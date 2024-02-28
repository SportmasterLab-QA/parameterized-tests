package ru.sportmaster.parameterized.tests;

public class JokeGenerator {

    public static String getJoke(String humorType) {
        switch (humorType) {
            case "батин юмор":
                return "- Батя, я голоден! - Привет, Голоден, я - Батя!";
            case "dev":
                return "Как Java-разработчик сообщает о расставании? \"Дело не в тебе, дело в NPE\"";
            case "ученые шутят":
                return "Заходит как-то в бар бесконечно количество математиков, а бармен им: - 'А ну пошли вон отсюда!'";
            default:
                return "Тип шутки не поддерживается";
        }
    }

}
