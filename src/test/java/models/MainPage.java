package models;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class MainPage extends BasePage{

    @Step("Открываем фрейм регистрации")
    public RegistrationFrame goToRegistrationFrame() {
        $x("//div[@class='Header_registration__1-FfP']/button").click();
        return new RegistrationFrame();
    }

    @Step("Открываем фрейм авторизации")
    public LoginFrame goToLoginFrame() {
        $x("//button[contains(@class, 'AuthButton')]").click();
        sleep(5000);
        return new LoginFrame();
    }

    @Step("Переходим в профиль пользователя")
    public UserProfilePage goToUserProfilePage() {
        $x("//div[contains(@class, 'ProfilePanel_pane')][2]").click();
        $x("//a[contains(@class, 'menu_edit')]").click();
        return new UserProfilePage();
    }
}
