package chili.nm.test;

import chili.nm.runner.BaseTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class NikTest extends BaseTest{
    @Test
    public void userCanLoginByUsername() {
//        Configuration.browserSize ="1920x1080";
        open("https://openweathermap.org/");
    }
}