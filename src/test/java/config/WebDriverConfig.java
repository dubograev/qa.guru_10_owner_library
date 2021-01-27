package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface WebDriverConfig extends Config {

    @Key("browser.version")
    String browserVersion();

    @Key("browserName")
    String browserName();

    @Key("baseUrl")
    String baseUrl();

    @Key("webDriver.remote.url")
    String webDriverRemoteURL();
}