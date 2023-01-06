package test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import helpers.Attach;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    private static final String BETANDREAS_PROD = "https://betandreas.com/";
    private static final String MOSTBET_PROD = "https://mostbet.com/";
    private static final String MB_DEV_50 = "https://dev50.mostbet.com/";
    private  static final String BA_DEV = "";

/*    private WebDriverWait wait;
    private WebDriver driver;

    protected WebDriverWait getWait() {
        if (wait == null) {
            wait = new WebDriverWait(driver, 10);
        }
        return wait;
    }*/

    @BeforeAll
    static void setup() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

        Configuration.browserCapabilities = capabilities;
        Configuration.browserSize = "1920x1080";
        //Configuration.remote = "http://192.168.0.112:8080/wd/hub/";
    }

    @BeforeEach
    public void testSetUp() {
        open(MB_DEV_50);
        $x("//div[contains(@class, 'AppPreloader')]").shouldNotBe(Condition.visible, Duration.ofSeconds(40));
        $x("//button[contains(@class, 'GiftPopup_close')]").shouldBe(Condition.visible, Duration.ofSeconds(30)).click();
    }


    @AfterEach
    public void tearDown() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();

    }
}
