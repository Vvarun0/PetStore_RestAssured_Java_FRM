package tests;


import Constant.StatusCode;
import base.PetService;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import models.response.Pet_Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.AssertionUtils;

import java.util.concurrent.TimeUnit;

public class PetStoreTest {

    @Story("Fetch Pet By Id")
    @Description("GET the pet by id , validate 200 Status Code")
    @Test()
    public void findPetByIdTest(){

        PetService petService = new PetService();
        Response response = petService.getPetById(5);

        Pet_Response petResponse = response.as(Pet_Response.class);
        System.out.println("Pet Name: " + petResponse.getName());
        System.out.println("Category: " + petResponse.getCategory().getName());

//       Assertions
       // Assert.assertEquals(response.statusCode(), 200);
        AssertionUtils.assertStatusCode(response.statusCode(), StatusCode.CODE_200);
        Assert.assertEquals(response.getContentType(), "application/json");
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS)< 3000);
    }
}
