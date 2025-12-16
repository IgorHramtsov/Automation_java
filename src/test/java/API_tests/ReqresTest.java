package API_tests;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Clock;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class ReqresTest {
    private final static String URL = "https://reqres.in";
    private final String API_KEY = "reqres-free-v1";

    @Test
    public void checkAvatarAndIdTest(){
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        List<UserData> users = given()
                .header("x-api-key", API_KEY)
                .when()
                .get("/api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);

        users.forEach(x-> Assert.assertTrue(x.getAvatar().contains(x.getId().toString())));

        Assert.assertTrue(users.stream().allMatch(x-> x.getEmail().endsWith("@reqres.in")));

        List<String> avatars = users.stream().map(UserData::getAvatar).collect(Collectors.toList());
        List<String> ids = users.stream().map(x-> x.getId().toString()).collect(Collectors.toList());
        for(int i = 0; i < avatars.size(); i++){
            Assert.assertTrue(avatars.get(i).contains(ids.get(i)));
        }
    }

    @Test
    public void successRegTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        Integer id = 4;
        String token = "QpwL5tke4Pnpja7X4";
        Register user = new Register("eve.holt@reqres.in", "pistol");
        SuccessReg successReg = given()
                .header("x-api-key", API_KEY)
                .body(user)
                .when()
                .post("/api/register")
                .then().log().all()
                .extract().as(SuccessReg.class);
        Assert.assertNotNull(successReg.getId());
        Assert.assertNotNull(successReg.getToken());

        Assert.assertEquals(id, successReg.getId());
        Assert.assertEquals(token, successReg.getToken());
    }

    @Test
    public void unSuccessRegTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecError400());

        Register user = new Register("sydney@fife", "");
        UnSuccessReg unSuccessReg = given()
                .header("x-api-key", API_KEY)
                .body(user)
                .when()
                .post("/api/register")
                .then().log().all()
                .extract().as(UnSuccessReg.class);

        Assert.assertNotNull(unSuccessReg.getError());
        Assert.assertEquals("Missing password", unSuccessReg.getError());
    }

    @Test
    public void sortedYearsTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        List<ColorsData> colors = given()
                .header("x-api-key", API_KEY)
                .when()
                .get("/api/unknown")
                .then().log().all()
                .extract().body().jsonPath().getList("data", ColorsData.class);
        List<Integer> years = colors.stream().map(ColorsData::getYear).collect(Collectors.toList());
        List<Integer> sortedYears = years.stream().sorted().collect(Collectors.toList());
        Assert.assertEquals(sortedYears, years);
        System.out.println(years);
        System.out.println(sortedYears);
    }

    @Test
    public void deleteUserTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecUnique(204));
        given()
                .header("x-api-key", API_KEY)
                .when()
                .delete("/api/users/2")
                .then().log().all();
    }

    @Test
    public void timeTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        UserTime user = new UserTime("morpheus", "zion resident");
        UserTimeResponse response = given()
                .header("x-api-key", API_KEY)
                .body(user)
                .when()
                .put("/api/users/2")
                .then().log().all()
                .extract().as(UserTimeResponse.class);

        String regex = "(.{8})$";
        String currentTime = Clock.systemUTC().instant().toString().replaceAll(regex, "");

        System.out.println("current: " + currentTime);
        System.out.println("response: " + response.getUpdatedAt().replaceAll(regex, ""));

        Assert.assertEquals(currentTime, response.getUpdatedAt().replaceAll(regex, ""));
    }

    @Test
    public void userNotFound(){
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecUnique(404));
        given()
                .header("x-api-key", API_KEY)
                .when()
                .get("/api/users/23")
                .then().log().all();
    }

    @Test
    public void createUserTest(){
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecUnique(201));
        CreateUser user = new CreateUser("Igor", "QA", "", new Date());
        given()
                .header("x-api-key", API_KEY)
                .body(user)
                .when()
                .post("/api/users")
                .then().log().all();

        Assert.assertNotNull(user.getId());
        Assert.assertNotNull(user.getCreatedAt());
        Assert.assertEquals(user.getName(), "Igor");
        Assert.assertEquals(user.getJob(), "QA");

     //   System.out.println("id: " + user.getId());
    }

    @Test
    public void loginUnsuccessTest(){
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecError400());

        Register user = new Register("peter@klaven", "");

        UnSuccessReg loginUnsuccess = given()
                .header("x-api-key", API_KEY)
                .body(user)
                .when()
                .post("/api/login")
                .then().log().all()
                .extract().as(UnSuccessReg.class);

        Assert.assertNotNull(loginUnsuccess.getError());
        Assert.assertEquals("Missing password", loginUnsuccess.getError());

    }
}
