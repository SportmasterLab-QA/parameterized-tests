package ru.sportmaster.parameterized.tests.api;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UserApiTest {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "http://api.example.com";
    }

    @DataProvider(name = "userIds")
    public Object[][] createUserData() {
        return new Object[][] {
            { "123", 200 }, // Корректный id пользователя
            { "xyz", 400 }, // id несуществующего пользователя
            { "", 400 }     // пустой id пользователя
        };
    }

    @Test(dataProvider = "userIds")
    public void testGetUser(String userId, int expectedStatusCode) {
        given()
            .pathParam("userId", userId)
        .when()
            .get("/users/{userId}")
        .then()
            .statusCode(expectedStatusCode);
    }
}