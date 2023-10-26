package chili.nm.runner;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.awt.*;
import java.time.Duration;

public abstract class BaseTest {
    @BeforeSuite
    public void setUp() {
        Configuration.timeout = 6000;
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) size.getWidth();
        int height = (int) size.getHeight();
        Configuration.browserSize = String.format("%dx%d", width, height);
    }

    @AfterMethod(alwaysRun = true)
    public void clearCookies() {
        Selenide.clearBrowserCookies();
    }
}
