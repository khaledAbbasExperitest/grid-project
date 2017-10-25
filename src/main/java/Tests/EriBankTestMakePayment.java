package Tests;

import com.experitest.client.Client;
import framework.ConnectionHandler;
import org.junit.Test;

/**
 * Created by ariel.hazan on 27-Sep-17.
 */
public class EriBankTestMakePayment extends BaseTest {
private int REBOOT_TIMEOUT=360000;

    public EriBankTestMakePayment() {

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


        client.launch("com.experitest.ExperiBank/.LoginActivity", true, false);
        client.elementSendText("NATIVE", "xpath=//*[@id='usernameTextField']", 0, "company");
        client.elementSendText("NATIVE", "xpath=//*[@id='passwordTextField']", 0, "company");
        client.closeKeyboard();
        client.click("NATIVE", "xpath=//*[@text='Login']", 0, 1);
        String strBefor = client.getTextIn("NATIVE", "xpath=//*[@text='Make Payment']", 0, "WEB", "Up", 0, 0);
        client.click("NATIVE", "xpath=//*[@text='Make Payment']", 0, 1);
        client.elementSendText("NATIVE", "xpath=//*[@id='phoneTextField']", 0, "0501231231");
        client.elementSendText("NATIVE", "xpath=//*[@id='nameTextField']", 0, "Erik");
        client.elementSendText("NATIVE", "xpath=//*[@id='amountTextField']", 0, "43.75");
        client.click("NATIVE", "id=countryButton", 0, 1);

        if (client.swipeWhileNotFound("Down", 100, 2000, "NATIVE", "xpath=//*[@text=Ethiopia']", 24, 1000,
                1, true)) {
            // If statement
        }
        client.click("NATIVE", "text=Ethiopia", 0, 1);
        client.click("NATIVE", "xpath=//*[@id='sendPaymentButton']", 0, 1);
        client.verifyElementFound("NATIVE", "xpath=//*[@text='Yes']", 0);
        client.click("NATIVE", "xpath=//*[@text='Yes']", 0, 1);

        String strAfter = client.getTextIn("NATIVE", "xpath=//*[@text='Make Payment']", 0, "WEB", "Up", 0, 0);

        strAfter = strAfter.split("Your balance is: ")[1];
        strBefor = strBefor.split("Your balance is: ")[1];

        strBefor = strBefor.substring(0, strBefor.length() - "$	 ".length());
        strAfter = strAfter.substring(0, strAfter.length() - "$	 ".length());

    }

    @Test
    public void ios() {
        Client client = new ConnectionHandler().clientAndroid();
        client.reboot(REBOOT_TIMEOUT);
        if (INSTRUMENT)
            client.install("C:\\GridProject\\grid-project\\Application\\EriBank.ipa", true, false);
        else
            client.launch("com.experitest.ExperiBank", false, true);


        client.elementSendText("NATIVE", "xpath=//*[@text='usernameTextField']", 0, "campany");
        client.elementSendText("NATIVE", "xpath=//*[@text='passwordTextField']", 0, "campany");
        client.closeKeyboard();
        client.click("NATIVE", "accessibilityLabel=loginButton", 0, 1);
        String strBefor = client.getTextIn("NATIVE", "xpath=//*[@text='Make Payment']", 0, "WEB", "Up", 0, 0, 0,
                0);
        client.click("NATIVE", "accessibilityLabel=makePaymentButton", 0, 1);
        client.elementSendText("NATIVE", "text=Phone", 0, "0501231231");
        client.elementSendText("NATIVE", "text=Name", 0, "Erik");
        client.elementSendText("NATIVE", "text=Amount", 0, "43.75");
        client.click("NATIVE", "text=Select", 0, 1);
        if (client.swipeWhileNotFound("Down", 300, 2000, "NATIVE", "xpath=//*[@text='South Korea']", 0,
                1000, 2, true)) {
            // If statement
        }
        client.click("NATIVE", "text=Send Payment", 0, 1);
        client.click("NATIVE", "text=Yes", 0, 1);
        String strAfter = client.getTextIn("NATIVE", "xpath=//*[@text='Make Payment']", 0, "WEB", "Up", 0, 0, 0,
                0);

        strAfter = strAfter.split("Your balance is:  ")[1];
        strBefor = strBefor.split("Your balance is:  ")[1];

        strBefor = strBefor.substring(0, strBefor.length() - "$   ".length());
        strAfter = strAfter.substring(0, strAfter.length() - "$   ".length());

    }
}
