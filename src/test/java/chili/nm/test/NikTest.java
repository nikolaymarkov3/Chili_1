package chili.nm.test;

import chili.nm.test.runner.BaseTest;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;

public class NikTest extends BaseTest {

    @Test
    public void userCanLoginByUsername() {
        open("https://openweathermap.org/");
    }
}
