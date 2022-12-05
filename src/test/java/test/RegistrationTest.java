package test;

import helpers.Utils;
import models.MainPage;
import models.UserProfilePage;
import org.junit.jupiter.api.Test;
import test.BaseTest;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationTest extends BaseTest {

    final static String EMAIL = Utils.userEmailGenerator();
    final static String PASS = "qweasd";

    @Test
    void registrationTest() {
        UserProfilePage userProfilePage = new MainPage()
                .goToRegistrationFrame()
                .gotoEmailRegister()
                .fillEmail(EMAIL)
                .fillPassword(PASS)
                .clickRegisterButton()
                .goToUserProfilePage();
        $(withText(EMAIL)).shouldBe(visible);
    }


}
