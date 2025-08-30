package Constant;

import config.ConfigFactory;

public class Path {
    public static String getBaseUri() {
        return ConfigFactory.getGeneralConfig().BASE_URL();
    }

//    public static final String BASE_URI = ConfigFactory.getGeneralConfig().BASE_URL();

    public static final String BASE_PATH = "/pet";
    public static final String FindPetById_Path = "/pet/{petId}";
}
