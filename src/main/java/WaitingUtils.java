import java.util.concurrent.TimeUnit;

/**
 * Created by Tester on 13.03.2016.
 */
public class WaitingUtils {
    public static void setImplicityWait(long time, TimeUnit unit){
        WebdriverHolder.getDriver().manage().timeouts().implicitlyWait(time, unit);
    }
}
