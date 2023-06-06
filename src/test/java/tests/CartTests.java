package tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.className;

public class CartTests extends TestBase {
    @Test
    void ageLimitTest() {
        open();
        $$(className("android.widget.TextView"))
                .findBy(text("Россия")).click();
        $(AppiumBy.id("com.wildberries.ru:id/remindLaterButton")).click();
        $(accessibilityId("Корзина")).click();
        $(AppiumBy.id("com.wildberries.ru:id/goToCatalogueButton")).click();
        $(accessibilityId("Товары для взрослых")).click();
        $(AppiumBy.id("com.wildberries.ru:id/textAgeConfirmTitle")).shouldHave(text("Вам есть 18 лет?"));

    }

}
