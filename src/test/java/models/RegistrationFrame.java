package models;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RegistrationFrame extends BasePage{

    @Step("Выбираем регистрацию по email")
    public RegistrationFrame gotoEmailRegister() {
        $(byText("По e-mail")).click();
        return this;
    }

    @Step("Выбираем регистрацию по номеру телефона")
    public RegistrationFrame switchPhoneNumberRegister() {
        $(byText("По телефону")).click();
        return this;
    }

    @Step("Заполняем поле email")
    public RegistrationFrame fillEmail(String email) {
        $x("//input[contains(@class,'email_reg_mail')]").sendKeys(email);
        return this;
    }

    @Step("Заполняем поле пароль")
    public RegistrationFrame fillPassword(String password) {
        $x("//input[contains(@class,'email_reg_password')]").sendKeys(password);
        return this;
    }

    @Step("Нажимаем на кнопку зарегистрироваться")
    public MainPage clickRegisterButton() {
        $x("//button[contains(@class,'submitButton')]").click();
        return new MainPage();
    }


    @Step("Выбираем страну")
    public RegistrationFrame selectCountry(String country) {

        return this;
    }

    @Step("Выбираем валюту")
    public RegistrationFrame selectCurrency(String currency) {

        return this;
    }

    @Step("Выбираем бонус")
    public RegistrationFrame selectBonus(String bonus) {

        return this;
    }
}