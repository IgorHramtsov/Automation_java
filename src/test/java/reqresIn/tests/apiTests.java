package reqresIn.tests;

import reqresIn.dto.UsersResponseDto;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class apiTests {



    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath = "/api";
    }

    @Test
    public void getUsers_page2_shouldReturnExpectedUsers() {

        UsersResponseDto response =
                given()
                        .log().all()
                        .header("Accept", "application/json")
                        .header("User-Agent", "Mozilla/5.0")
                        .queryParam("page", 2)
                        .when()
                        .get("/users")
                        .then()
                        .log().all()
                        .statusCode(200)
                        .extract()
                        .as(UsersResponseDto.class);

        // общие проверки
        Assert.assertEquals(response.getPage(), 2);
        Assert.assertEquals(response.getPerPage(), 6);
        Assert.assertEquals(response.getTotal(), 12);
        Assert.assertEquals(response.getTotalPages(), 2);

        // данные
        Assert.assertNotNull(response.getData());
        Assert.assertEquals(response.getData().size(), 6);

        // точечные проверки по ids/emails
        List<Integer> ids = response.getData().stream().map(u -> u.getId()).collect(Collectors.toList());
        Assert.assertEquals(ids, List.of(7, 8, 9, 10, 11, 12));

        Assert.assertEquals(response.getData().get(0).getEmail(), "michael.lawson@reqres.in");
        Assert.assertEquals(response.getData().get(5).getEmail(), "rachel.howell@reqres.in");
    }
}
