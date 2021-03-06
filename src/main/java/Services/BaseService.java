package Services;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BaseService {

    public RequestSpecification setupRequestSpecification(){
      RequestSpecification requestSpecification = RestAssured.given().baseUri("https://rickandmortyapi.com/api");
      return requestSpecification;
    }
}
