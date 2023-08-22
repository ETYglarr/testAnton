package apiTests;

import api.ResponseSuccessfulReg;
import api.SuccessfulReg;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class apiRegTest {

    private final static String URL = "https://reqres.in/";
    @Test
    public void successfulRegTest(){
        SuccessfulReg user = new SuccessfulReg("eve.holt@reqres.in", "pistol");
        Integer id = 4;
        String token = "QpwL5tke4Pnpja7X4";
        ResponseSuccessfulReg response = given()
                .contentType(ContentType.JSON)
                .body(user)
                .when()
                .post(URL + "api/register")
                .then().log().all()
                .statusCode(200)
                .extract().as(ResponseSuccessfulReg.class);

        Assert.assertEquals(id, response.getId());
        Assert.assertEquals(token, response.getToken());

    }
}
