package test;


import helpers.Utils;
import models.MainPage;
import models.UserProfilePage;
import org.junit.jupiter.api.Test;

public class RegistrationTest extends BaseTest {

    final static String EMAIL = Utils.userEmailGenerator();
    final static String PASS = "Qweasd12345";
    final static String COUNTRY = "Латвия";
    final static String CURRENCY = "EUR";

    @Test
    void emailRegistrationTest() {
        UserProfilePage userProfilePage = new MainPage()
                .goToRegistrationFrame()
                .gotoEmailRegister()
                .fillEmail(EMAIL)
                .fillPassword(PASS)
                .selectCountry(COUNTRY)
                .selectCurrency(CURRENCY)
                .clickRegisterButton()
                .goToUserProfilePage()
                .checkUserProfileAfterEmailRegistration(EMAIL, COUNTRY, CURRENCY);
    }

    @Test
    void phoneRegistrationTest() {

    }

}
