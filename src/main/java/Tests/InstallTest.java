package Tests;

import com.experitest.client.Client;
import framework.ConnectionHandler;
import framework.NewAndroidDriver;
import framework.NewIOSDriver;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ariel.hazan on 24-Oct-17.
 */
public class InstallTest {
    private ConnectionHandler connectionHandler;

    @Before
    public void setup() {
        connectionHandler = new ConnectionHandler();
    }

    @Test
    public void InstallInstrumented() {
        //Android
        Client client = connectionHandler.clientAndroid();
        client.install("C:\\GridProject\\grid-project\\src\\main\\resources\\EriBank.apk", true, true);
        client.launch("cloud:com.experitest.ExperiBank/.LoginActivity", true, true);
        client.install("C:\\GridProject\\grid-project\\src\\main\\resources\\UICatalog.apk", true, false);
        client.launch("cloud:com.experitest.ExperiBank/.LoginActivity", true, false);
        client.releaseClient();


        NewAndroidDriver driver = connectionHandler.appiumAndroidAPP("C:\\GridProject\\grid-project\\src\\main\\resources\\EriBank.apk", true);
        driver.launchApp();
        driver.closeApp();
        driver.quit();


        //IOS
        client = connectionHandler.clientIOS();
        client.install("C:\\GridProject\\grid-project\\src\\main\\resources\\EriBank.ipa", true, true);
        client.launch("cloud:com.experitest.ExperiBank", true, true);
        client.install("C:\\GridProject\\grid-project\\src\\main\\resources\\EriBank.ipa", true, false);
        client.launch("cloud:com.experitest.ExperiBank", true, false);
        client.releaseClient();

        NewIOSDriver driver2 = connectionHandler.appiumIOSAPP("C:\\GridProject\\grid-project\\src\\main\\resources\\EriBank.ipa", true);
        driver2.launchApp();
        driver2.closeApp();
        driver2.quit();


    }

    @Test
    public void InstallNonInstrumented() {
        //Android
        Client client = connectionHandler.clientAndroid();
        client.install("C:\\GridProject\\grid-project\\src\\main\\resources\\EriBank.apk", false, true);
        client.launch("cloud:com.experitest.ExperiBank/.LoginActivity", false, true);
        client.install("C:\\GridProject\\grid-project\\src\\main\\resources\\UICatalog.apk", false, false);
        client.launch("cloud:com.experitest.ExperiBank/.LoginActivity", false, false);
        client.releaseClient();


        NewAndroidDriver driver = connectionHandler.appiumAndroidAPP("C:\\GridProject\\grid-project\\src\\main\\resources\\EriBank.apk", true);
        driver.launchApp();
        driver.closeApp();
        driver.quit();


        //IOS
        client = connectionHandler.clientIOS();
        client.install("C:\\GridProject\\grid-project\\src\\main\\resources\\EriBank.ipa", false, true);
        client.launch("cloud:com.experitest.ExperiBank", false, true);
        client.install("C:\\GridProject\\grid-project\\src\\main\\resources\\EriBank.ipa", false, false);
        client.launch("cloud:com.experitest.ExperiBank", false, false);
        client.releaseClient();

        NewIOSDriver driver2 = connectionHandler.appiumIOSAPP("C:\\GridProject\\grid-project\\src\\main\\resources\\EriBank.ipa", false);
        driver2.launchApp();
        driver2.closeApp();
        driver2.quit();

    }
}
