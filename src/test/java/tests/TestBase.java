package tests;

import com.codeborne.selenide.Configuration;
import drivers.BrowserstackMobileDriver;
import drivers.LocalMobileDriver;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.browser = BrowserstackMobileDriver.class.getName();
        Configuration.browserSize = null;
    }
}
