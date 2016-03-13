import org.openqa.selenium.By;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by Tester on 13.03.2016.
 */
public class AutorizationPage {

    //locators bu CSS
    public static final String LOGIN_INPUT ="#signin-email";
    public static final String PASSWORD_INPUT ="#signin-password";
    public static final String LOGIN_BUTTON =".submit.btn.primary-btn.flex-table-btn.js-submit";


    public void open(){
        UiUtils.goTo("https://twitter.com/");
        WaitingUtils.setImplicityWait(10, SECONDS);
    }

    public String getTitle(){
        return WebdriverHolder.getDriver().getTitle();
    }

    public void login(String login, String password){
        UiUtils.$(By.cssSelector(LOGIN_INPUT)).sendKeys(login);
        UiUtils.$(By.cssSelector(PASSWORD_INPUT)).sendKeys(password);
        UiUtils.$(By.cssSelector(LOGIN_BUTTON)).click();
    }

}
