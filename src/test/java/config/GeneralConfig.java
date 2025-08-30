package config;
import org.aeonbits.owner.Config;

//https://dheerajgambhir.medium.com/properties-files-in-java-with-owner-library-eda7b2b6d9b6
@Config.Sources({"classpath:general.properties"})
public interface GeneralConfig extends Config {

    @Config.Key("base.url")
    String BASE_URL();

}
