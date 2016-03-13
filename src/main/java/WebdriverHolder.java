import org.openqa.selenium.WebDriver;

/**
 * Created by Tester on 13.03.2016.
 */
public class WebdriverHolder {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        WebdriverHolder.driver = driver;
    }
}
