package base;


import Constant.Path;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
//wrapper class for RestAssured that will contain all http methods for abstractions

    private static RequestSpecification requestSpecification;


    public  BaseService(){
        String baseUri = Path.getBaseUri();
        if (baseUri == null || baseUri.isEmpty()) {
            throw new IllegalStateException("BASE_URI is not configured properly.");
        }
        requestSpecification = RestAssured.given().baseUri(Path.getBaseUri());
    }

    protected Response getRequest(String basePath)
    {
        return requestSpecification.get(basePath);
    }

    protected Response postRequest (Object payload , String path)
    {
        return requestSpecification.contentType(ContentType.JSON)
                .body(payload).post(path);
    }

    protected Response getRequestWithPathParam (int pathParamValue)
    {
        return requestSpecification.pathParam("petId",pathParamValue).get(Path.FindPetById_Path);
    }
}
