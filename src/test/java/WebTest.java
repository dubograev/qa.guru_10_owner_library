import com.codeborne.selenide.Configuration;
import config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class WebTest {

    @BeforeAll
    static void setup (){
        WebDriverConfig webDriverConfig = ConfigFactory.create(WebDriverConfig.class);
        Configuration.startMaximized = true;
        Configuration.remote =webDriverConfig.webDriverRemoteURL();
        Configuration.browser = webDriverConfig.browserName();
        Configuration.browserVersion = webDriverConfig.browserVersion();
        Configuration.baseUrl = webDriverConfig.baseUrl();
    }

    @Test
    void search() {
        open("");
        screenshot("pass");
    }

    @AfterEach
    public void afterEach(){
        closeWebDriver();
    }

}