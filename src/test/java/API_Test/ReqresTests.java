package API_Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ReqresTests {

    private final String API_KEY = "reqres_ef3a85713a2a490487ef4baeb00e8826"; // встав свій ключ

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://reqres.in";
    }

    @Test
    public void getUsersTest() {
        given()
                .log().all()
                .when()
                .get("/api/users?page=2")
                .then()
                .log().all()
                .statusCode(200)
                .body("data.id", hasItems(7, 8, 9)); // перевірка що є юзери з такими id
    }

    @Test
    public void createUserTest() {
        String requestBody = "{ \"name\": \"Igor\", \"job\": \"QA\" }";

        given()
                .header("x-api-key", API_KEY)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .log().all()
                .when()
                .post("/api/users")
                .then()
                .log().all()
                .statusCode(201)
                .body("name", equalTo("Igor"))
                .body("job", equalTo("QA"));
    }

    @Test
    public void updateUserTest() {
        String requestBody = "{ \"name\": \"Igor\", \"job\": \"Automation QA\" }";

        given()
                .header("x-api-key", API_KEY)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .log().all()
                .when()
                .put("/api/users/2")
                .then()
                .log().all()
                .statusCode(200)
                .body("job", equalTo("Automation QA"));
    }

    @Test
    public void deleteUserTest() {
        given()
                .header("x-api-key", API_KEY)
                .log().all()
                .when()
                .delete("/api/users/2")
                .then()
                .log().all()
                .statusCode(204); // No Content
    }
}