package models;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage extends BasePage{

    @Step("Открываем фрейм регистрации")
    public RegistrationFrame goToRegistrationFrame() {
        $x("//button[contains(@class,'Registration_btn')]").click();
        return new RegistrationFrame();
    }

    @Step("Открываем фрейм авторизации")
    public LoginFrame goToLoginFrame() {
        $x("//button[contains(@class, 'AuthButton')]").click();
        return new LoginFrame();
    }

    @Step("Переходим в профиль пользователя")
    public UserProfilePage goToUserProfilePage() {
        $(".ProfilePanel_root__1GUVA").click();
        $x("//a[contains(@class, 'menu_edit')]").click();
        return new UserProfilePage();
    }
}
