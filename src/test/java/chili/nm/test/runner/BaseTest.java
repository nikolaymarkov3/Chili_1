package chili.nm.test.runner;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import java.awt.*;

public class BaseTest {
    static boolean isServerRun() {
        return System.getenv("CI_RUN") != null;}
//
//            private static void initProperties () {
//                if (properties == null) {
//                    properties = new Properties();
//                    if (isServerRun()) {
//                        properties.setProperty("default.browserSize", System.getenv("browserSize"));
//                    } else {
//                        try {
//                            InputStream inputStream = BaseTest.class.getClassLoader().getResourceAsStream("selenide.properties");
//                            if (inputStream == null) {
//                                System.out.println("ERROR: The \u001B[31mselenide.properties\u001B[0m file not found in src/test/resources/ directory.");
//                                System.out.println("You need to create it from selenide.properties.TEMPLATE file.");
//                                System.exit(1);
//                            }
//                            properties.load(inputStream);
//                        } catch (IOException ignore) {
//                        }
//                    }
//                }
//            }

//        private static ChromeOptions getChromeOptions() {
//            ChromeOptions options = new ChromeOptions();
//            String chromeOptionsString = properties.getProperty("selenide.browserSize");
//            if (chromeOptionsString != null) {
//                for (String argument : chromeOptionsString.split(";")) {
//                    options.addArguments(argument);
//                }
//            }
//            return options;
//        }
//        private static void setupDriver() {
//            WebDriverManager.chromedriver().setup();
//        }
//        public static SelenideDriver getDriver() {
//            SelenideDriver driver = null;
//            return driver;
//        }



    @BeforeSuite
    public void setUp() {
//            initProperties();
        if (!isServerRun()) {
            Configuration.timeout = 6000;
            Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
            int width = (int) size.getWidth();
            int height = (int) size.getHeight();
            Configuration.browserSize = String.format("%dx%d", width, height);
        }
    }

    @AfterMethod(alwaysRun = true)
    public void clearCookies() {
        Selenide.clearBrowserCookies();
    }
}
