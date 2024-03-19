package ru.sportmaster.parameterized.tests.ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.sportmaster.parameterized.tests.ui.pages.PersonalProfilePage;

public class FieldValidationTest {

    @DataProvider(name = "fieldDataProvider")
    public Object[][] provideFieldData() {
        return new Object[][]{
                {"слишком_длинное_значение_поля_дата_рождения", "Значение превышает максимальную длину!"},
                {"не_похожее_на_дату_значение", "Введите дату рождения в формате yyyy/mm/dd!"},
                {"2011/12/1", "Возраст менее 18 лет недопустим!"},
        };
    }

    @Test(dataProvider = "fieldDataProvider")
    public void test(String dateOfBirth, String expectedValidationErrorText) {
        PersonalProfilePage personalProfilePage = new PersonalProfilePage();

        personalProfilePage
                .open()
                .setDateOfBirth(dateOfBirth)
                .assertValidationErrorTextEqualTo(expectedValidationErrorText);
    }

}
