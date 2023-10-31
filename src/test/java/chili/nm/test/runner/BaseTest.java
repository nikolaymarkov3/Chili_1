package chili.nm.test.runner;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;
import java.io.InputStream;

public class BaseTest {
    static boolean isServerRun() {
        return System.getenv("CI_RUN") != null;}

    private static void initProperties() {
        if (isServerRun()) {
            Configuration.headless = true;
            Configuration.browserSize = "1920x1080";
        }else {
            InputStream inputStream = BaseTest.class.getClassLoader().getResourceAsStream("selenide.properties");
            if (inputStream == null) {
                System.out.println("ERROR: The \u001B[31mselenide.properties\u001B[0m file not found in src/test/resources/ directory.");
                System.out.println("You need to create it from selenide.properties.TEMPLATE file.");
                System.exit(1);
            }
        }

    }
    @BeforeSuite
    public void setUp() {
        initProperties();
    }
}
