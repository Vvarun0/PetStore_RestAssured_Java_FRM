package base;

import io.restassured.response.Response;

public class PetService extends BaseService {
    //Each service will have a base class and each service method will be seperate method that will call base http methods

    public Response getPetById (int petIdValue ){
        return getRequestWithPathParam(petIdValue );
    }
}
