import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class RegistrationTest extends BaseTest {

    private static final String EMAIL = "test00011@test.com";

    @Test
    void registrationTest() {
        open("https://betandreas.com/");

        step("Открываем фрейм регистрации", () -> {
            $x("//button[contains(@class,'Registration_btn')]").click();
        });
        step("Выбираем регистрация по email", () -> {
            $(withText("По e-mail")).click();
        });
        step("Заполняем email", () -> {
            $x("//input[contains(@class,'email_reg_mail')]").sendKeys(EMAIL);
        });
        step("Заполняем пароль", () -> {
            $x("//input[contains(@class,'email_reg_password')]").sendKeys("Qweasd12345");
        });
        step("Нажимаем кнопку Зарегистрироваться", () -> {
            $x("//button[contains(@class,'submitButton')]").click();
        });
        step("Переходим в профиль", () -> {
            $(".ProfilePanel_root__1GUVA").click();
            $(withText("ЛИЧНЫЕ ДАННЫЕ")).click();
        });
        step("Проверяем email в профиле", () -> {
            $(withText(EMAIL)).shouldHave(Condition.text(EMAIL));
        });
    }
}
