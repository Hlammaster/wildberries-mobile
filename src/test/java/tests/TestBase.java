package tests;

import com.codeborne.selenide.Configuration;
import drivers.LocalMobileDriver;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.browser = LocalMobileDriver.class.getName();
        Configuration.browserSize = null;
    }
}
