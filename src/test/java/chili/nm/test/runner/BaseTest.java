package chili.nm.test.runner;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import chili.nm.utils.TestListeners;

import java.awt.*;
import java.util.Properties;


@Listeners(TestListeners.class)
public class BaseTest {

    @BeforeSuite
    public void setUp() {
        Configuration.timeout = 6000;
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int width = 1920;
        int height = 1080;
        Configuration.browserSize = String.format("%dx%d", width, height);
    }

    @AfterMethod(alwaysRun = true)
    public void clearCookies() {
        Selenide.clearBrowserCookies();
    }
}