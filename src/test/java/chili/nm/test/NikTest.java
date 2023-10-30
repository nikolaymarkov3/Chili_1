package chili.nm.test;

import chili.nm.test.runner.BaseTest;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class NikTest extends BaseTest{

    @Test

    public void userCanLoginByUsername() {
//        Configuration.browserSize ="1920x1080";
//        Configuration.headless = true;
        open("https://openweathermap.org/");
    }
}
