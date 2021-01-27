import config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    void api() {
        ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class);
        System.out.println(apiConfig.pass());
        System.out.println(apiConfig.login());
        System.out.println(apiConfig.apiUrl());
    }
}