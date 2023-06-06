package drivers;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackMobileDriver implements WebDriverProvider {
    public static URL getAppiumServerUrl() {
    try {
        return new URL("http://hub.browserstack.com/wd/hub");
    } catch (MalformedURLException e) {
        throw new RuntimeException(e);
    }
}

    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.merge(capabilities);

        // Set your access credentials
        mutableCapabilities.setCapability("browserstack.user", "siriusblack_O7laPX");
        mutableCapabilities.setCapability("browserstack.key", "w5R4AzqsB5a2Z6MMT63X");

        // Set URL of the application under test
        mutableCapabilities.setCapability("app", "bs://e2340756353e44b0ca3254ce4cf6b7c5d223fc0f");

        // Specify device and os_version for testing
        mutableCapabilities.setCapability("device", "Google Pixel 5");
        mutableCapabilities.setCapability("os_version", "11.0");

        // Set other BrowserStack mutableCapabilities
        mutableCapabilities.setCapability("project", "First Java Project");
        mutableCapabilities.setCapability("build", "browserstack-build-1");
        mutableCapabilities.setCapability("name", "first_test");

        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired mutableCapabilities defined above
        return new RemoteWebDriver(getAppiumServerUrl(), mutableCapabilities);
    }
}
