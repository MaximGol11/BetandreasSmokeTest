package models;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class UserProfilePage extends BasePage{

    @Step("Заполняем фамилию")
    public UserProfilePage fillLastName(String lastName) {
        $x("//div[contains(@class, 'profile_last_name')]//input").sendKeys(lastName);
        return this;
    }


}
