package models;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;


import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFrame extends BasePage{

    @Step("Выбираем регистрацию по email")
    public RegistrationFrame gotoEmailRegister() {
        $x("//button[contains(@class, 'auto_email_reg')]").shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }

    @Step("Выбираем регистрацию по номеру телефона")
    public RegistrationFrame gotoPhoneNumberRegister() {
        $x("//button[contains(@class, 'auto_phone_reg')]").click();
        return this;
    }

/*            for (SelenideElement element : getLocators().emailInputAreaList) {
        if (element.isDisplayed()) {
            element.sendKeys(emailGenerator());
        }
    }*/

    @Step("Заполняем поле email")
    public RegistrationFrame fillEmail(String email) {
        for (SelenideElement element : $$x("//input[contains(@class,'email_reg_mail')]")) {
            if (element.isDisplayed()) element.sendKeys(email);
        }
      //  $x("//input[contains(@class,'email_reg_mail')]").sendKeys(email);
        return this;
    }

    @Step("Заполняем поле пароль")
    public RegistrationFrame fillPassword(String password) {
        for (SelenideElement element : $$x("//input[contains(@class,'email_reg_password')]")) {
            if (element.isDisplayed()) element.sendKeys(password);
        }
        //$x("//input[contains(@class,'email_reg_password')]").sendKeys(password);
        return this;
    }

    @Step("Заполняем поле телефон")
    public RegistrationFrame fillPhoneNumber(String phone) {
        $x("//input[contains(@class, 'SelectPhoneNumber_input')]").sendKeys(phone);
        return this;
    }

    @Step("Нажимаем на кнопку зарегистрироваться")
    public MainPage clickRegisterButton() {
        $x("//button[contains(@class,'submitButton')]").click();
        return new MainPage();
    }


    @Step("Выбираем страну")
    public RegistrationFrame selectCountry(String country) {
        $x("//div[contains(@class, 'email_reg_country_code')]").click();
        $x("//div[text()='"+ country + "']").click();
        return this;
    }

    @Step("Выбираем валюту")
    public RegistrationFrame selectCurrency(String currency) {
        $x("//div[contains(@class, 'auto_reg_currency')]").click();
        $x("//div[text()='" + currency + "']").click();
        return this;
    }

    @Step("Выбираем бонус")
    public RegistrationFrame selectBonus(String bonus) { // casino, sport, refusal
        $x("//button[contains(@class, 'BonusCard_" + bonus +"')]").click();
        return this;
    }
}
