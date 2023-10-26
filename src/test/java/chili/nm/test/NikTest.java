package chili.nm.test;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;

import static com.codeborne.selenide.Selenide.open;

public class NikTest{

    @Test

    public void userCanLoginByUsername() {
        Configuration.browserSize ="1920x1080";
        Configuration.headless = true;
        open("https://openweathermap.org/");
    }
}
