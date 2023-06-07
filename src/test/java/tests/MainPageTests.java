package tests;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.qameta.allure.Allure.step;

@Owner("Evgenii Goncharov")
@Epic("Mobile Tests")
@Feature("Main Page Tests")
@Severity(SeverityLevel.CRITICAL)
public class MainPageTests extends TestBase {

    @DisplayName("Проверка основных вкладок приложения")
    @Test
    void mainMenuContentTest() {
        step("Проверить, что отображается поисковое поле", () ->
                $(AppiumBy.id("com.wildberries.ru:id/search_searchEditText")).shouldBe(visible));
        step("Перейти на вкладку 'Каталог'", () ->
                $(accessibilityId("Каталог")).click());
        step("Проверить отображение категории 'Женщинам'", () ->
                $(accessibilityId("Женщинам")).shouldBe(visible).shouldBe(enabled));
        step("Перейти на вкладку 'Корзина'", () ->
                $(accessibilityId("Корзина")).click());
        step("Проверить, что корзина пуста", () ->
                $(AppiumBy.id("com.wildberries.ru:id/tvTitle")).shouldHave(text("Ваша корзина пуста")));
        step("Перейти на вкалдку 'Профиль'", () ->
                $(accessibilityId("Профиль")).click());
        step("Проверить, что появилась кнопка 'Войти в профиль', кнопка кликабельна", () ->
                $(AppiumBy.className("android.widget.Button")).shouldBe(visible).shouldBe(enabled));

    }

    @DisplayName("Проверка смена валюты")
    @Test
    void currencyChangeTest() {
        step("Нажать кнопку 'сменить стоимость товаров'", () ->
                $(AppiumBy.id("com.wildberries.ru:id/savedCurrencyNameView")).click());
        step("Выбрать казахский тенге", () ->
                $(accessibilityId("Казахский тенге")).click());
        step("Проверить корректность отображения валюты", () ->
                $(AppiumBy.id("com.wildberries.ru:id/savedCurrencyNameView"))
                        .shouldHave(text("\uD83C\uDDF0\uD83C\uDDFF тг.")));

    }
}

