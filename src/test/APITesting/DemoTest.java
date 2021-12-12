import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class DemoTest {

    @Test
    public void testcaseA(){
        Response response = RestAssured.get("https://6143a99bc5b553001717d06a.mockapi.io/testapi/v1/Users");
        System.out.println(response.statusCode());
        System.out.println(response.asString());
        System.out.println(response.getBody().asString());
        System.out.println(response.statusLine());

        int statusCode = response.getStatusCode();
         Assert.assertEquals(statusCode, 200);
    }

    @Test
    public void postCreateUsaert(){

            File jsonfile = new File("src/resources/createuser.json");
            RestAssured.given().baseUri("https://6143a99bc5b553001717d06a.mockapi.io/testapi/v1//Users").body(jsonfile).when().post().then().statusCode(200);
         System.out.println("done");
    }


}

/*


 */