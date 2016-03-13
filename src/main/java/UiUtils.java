import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Tester on 13.03.2016.
 */
public class UiUtils {

    //method for search elements
    public static WebElement $(By by){
        return WebdriverHolder.getDriver().findElement(by);
    }

    public static void goTo(String url){
        WebdriverHolder.getDriver().get(url);
    }

}
