package tests;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.qameta.allure.Allure.step;

@Owner("Evgenii Goncharov")
@Epic("Mobile Tests")
@Feature("Cart Tests")
@Severity(SeverityLevel.MINOR)
public class CartTests extends TestBase {
    @Test
    void ageLimitTest() {
        step("Перейти на вкладку 'Корзина'", () ->
                $(accessibilityId("Корзина")).click());
        step("Выбрать 'Товары для взрослых'", () -> {
            $(AppiumBy.id("com.wildberries.ru:id/goToCatalogueButton")).click();
            $(accessibilityId("Товары для взрослых")).click();
        });
        step("Проверить, что появилось предупреждающее сообщение", () ->
                $(AppiumBy.id("com.wildberries.ru:id/textAgeConfirmTitle")).shouldHave(text("Вам есть 18 лет?")));

    }

}
