package utils;

import Constant.StatusCode;
import io.qameta.allure.Step;
import org.testng.Assert;

/**
 * Utility class to store all the reusable assertions for API Tests validation
 * These assertions are called from these methods with @Step annotation
 * Methods annotated with allure @Step annotation are displayed as separate test step in allure report
 */
public class AssertionUtils {
    /**
     * This method performs assertions for validation of status code
     *
     * @param actualStatusCode
     * @param statusCode       StatusCode ENUM constant that stores code and message
     */
    @Step
    public static void assertStatusCode(int actualStatusCode , StatusCode statusCode){
        Assert.assertEquals(actualStatusCode,statusCode.code);
    }


}
