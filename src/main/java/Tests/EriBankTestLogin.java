package Tests;

import com.experitest.client.Client;
import framework.ConnectionHandler;
import org.junit.Test;

import java.util.Scanner;

/**
 * Created by ariel.hazan on 27-Sep-17.
 */
public class EriBankTestLogin extends BaseTest {
    private int REBOOT_TIMEOUT = 360000;
    private String[] inputStream;

    public EriBankTestLogin() {
        inputStream = new String[]{"company,company1", "company,company1", "ariel,company", "company,ariel", ",company", "company,", "company,company"};
    }
    @Test
    public void android() {
        Client client = new ConnectionHandler().clientAndroid();
        client.reboot(REBOOT_TIMEOUT);
        client.install("C:\\GridProject\\grid-project\\Application\\EriBank.apk", true, false);
        if (INSTRUMENT)
            client.launch("com.experitest.ExperiBank/.LoginActivity", true, true);
        else
            client.launch("com.experitest.ExperiBank/.LoginActivity", false, true);


        int i = 0;
        while (i < inputStream.length) {
            String data = inputStream[i];
            String[] values = data.split(",");

            client.elementSendText("NATIVE", "xpath=//*[@id='usernameTextField']", 0, values[0]);
            client.elementSendText("NATIVE", "xpath=//*[@id='passwordTextField']", 0, values[1]);
            client.click("NATIVE", "xpath=//*[@text='Login']", 0, 1);
            if (client.isElementFound("NATIVE", "xpath=//*[@text='Invalid username or password!']", 0))
                client.click("NATIVE", "xpath=//*[@text='Close']", 0, 1);
            else
                client.click("NATIVE", "xpath=//*[@text='Logout']", 0, 1);
        }
    }

    @Test
    public void ios() {
        Client client = new ConnectionHandler().clientAndroid();
        client.reboot(REBOOT_TIMEOUT);
        if (INSTRUMENT)
            client.install("C:\\GridProject\\grid-project\\Application\\EriBank.ipa", true, false);
        else
            client.launch("com.experitest.ExperiBank", false, true);


        int i = 0;
        while (i < inputStream.length) {
            String data = inputStream[i];
            String[] values = data.split(",");
            if (!client.isElementFound("NATIVE", "xpath=//*[@text='usernameTextField']", 0)) {
                client.click("NATIVE", "xpath=//*[@name='usernameTextField']", 0, 1);
                client.click("NATIVE", "xpath=//*[@text='Clear text']", 0, 1);
            }

            client.elementSendText("NATIVE", "xpath=//*[@text='usernameTextField']", 0, values[0]);
            client.elementSendText("NATIVE", "xpath=//*[@accessibilityLabel='passwordTextField']", 0, values[1]);

            client.click("NATIVE", "xpath=//*[@text='loginButton']", 0, 1);
            if (client.isElementFound("NATIVE", "xpath=//*[@text='Invalid username or password!']", 0))
                client.click("NATIVE", "xpath=//*[@text='Dismiss']", 0, 1);
            else
                client.click("NATIVE", "xpath=//*[@text='logoutButton']", 0, 1);
        }

    }
}
