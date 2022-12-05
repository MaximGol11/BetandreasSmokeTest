package models;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginFrame extends BasePage{

    @Step("Вводим логин")
    public LoginFrame fillLogin(String login) {
        $("#uReal").sendKeys(login);
        return this;
    }

    @Step("Вводим пароль")
    public LoginFrame fillPassword(String password) {
        $("#pReal").sendKeys(password);
        return this;
    }

    @Step("Нажимаем кнопку Логин")
    public MainPage clickLoginButton() {
        $x("//button[contains(@class, 'LoginForm_submitButton')]").click();
        return new MainPage();
    }
}
