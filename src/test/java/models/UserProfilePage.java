package models;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class UserProfilePage extends BasePage{

    @Step("Заполняем фамилию")
    public UserProfilePage fillLastName(String lastName) {
        $x("//div[contains(@class, 'profile_last_name')]//input").sendKeys(lastName);
        return this;
    }

    @Step("Проверяем данные пользователя после регистрации")
    public UserProfilePage checkUserProfileAfterEmailRegistration(String email, String country, String currency) {
        $x("//input[@value='" + email + "']").shouldBe(visible);
        $x("//input[@value='" + country + "']").shouldBe(visible);
        $x("//input[@value='" + currency + "']").shouldBe(visible);
        return this;
    }
}
