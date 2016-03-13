import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tester on 13.03.2016.
 */
public class TwitterAutorizationTest {
    WebDriver driver;
    AutorizationPage page;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        WebdriverHolder.setDriver(driver);
        page = new AutorizationPage();
    }

    @Test
    public void correctAutorization() throws Exception {
        page.open();
        assertEquals("Добро пожаловать в Твиттер — войти или зарегистрироваться", page.getTitle());
        page.login("dp150192bov@gmail.com", "150192bov");
        assertEquals("Твиттер", page.getTitle());
    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }
}
