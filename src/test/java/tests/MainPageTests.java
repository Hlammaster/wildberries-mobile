package tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.className;

public class MainPageTests extends TestBase {


    @Test
    void mainMenuContentTest() {
        open();
        $$(className("android.widget.TextView"))
                .findBy(text("Россия")).click();
        $(AppiumBy.id("com.wildberries.ru:id/remindLaterButton")).click();
        $(AppiumBy.id("com.wildberries.ru:id/search_searchEditText")).shouldBe(visible);
        $(accessibilityId("Каталог")).click();
        $(accessibilityId("Женщинам")).shouldBe(visible).shouldBe(enabled);
        $(accessibilityId("Корзина")).click();
        $(AppiumBy.id("com.wildberries.ru:id/tvTitle")).shouldHave(text("Ваша корзина пуста"));
        $(accessibilityId("Профиль")).click();
        $(AppiumBy.className("android.widget.Button")).shouldBe(visible).shouldBe(enabled);

    }

    @Test
    void languageTest(){
        open();
        $$(className("android.widget.TextView"))
                .findBy(text("Россия")).click();
        $(AppiumBy.id("com.wildberries.ru:id/remindLaterButton")).click();
        $(AppiumBy.id("com.wildberries.ru:id/savedCurrencyNameView")).click();
        $(accessibilityId("Казахский тенге")).click();
        $(AppiumBy.id("com.wildberries.ru:id/savedCurrencyNameView"))
                .shouldHave(text("\uD83C\uDDF0\uD83C\uDDFF тг."));

    }
}

