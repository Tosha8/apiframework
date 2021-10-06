import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;
import org.junit.Test;


public class RestAPIDemo {
    public static void main(String[] args) {
        String uri = "https://gorest.co.in/public/v1/users";


        RequestSpecification  requestSpecification;
        Response response = RestAssured
                .given()
                .baseUri(uri)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when()
                .request("GET");

        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().prettyPrint());
    }

    @Test
    public void test1(){

        RequestSpecification request = RestAssured.given();
        Response response= request.baseUri("https://regres.in").when().accept(ContentType.JSON).get("/api/users");

        System.out.println(response.getBody().prettyPrint());

    }
}
