package ru.sportmaster.parameterized.tests.ui.pages;

public class PersonalProfilePage {

    public PersonalProfilePage open() {
        return this;
    }

    public PersonalProfilePage setDateOfBirth(String dateOfBirth) {
        return this;
    }

    public PersonalProfilePage assertValidationErrorTextEqualTo(String validationErrorText) {
        return this;
    }

}
