package framework;


import com.experitest.client.Client;
import com.experitest.client.GridClient;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;


/**
 * Created by Ariel Hazan on 9/24/2017.
 */
public class ConnectionHandler extends Runner {
    private int waitForDeviceTimeout = 360 * 1000; // TODO Make variable conformable

    public NewIOSDriver appiumIOS(String appNameID) {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("testName", "Appium IOS Test");
        dc.setCapability("username", HOST);
        dc.setCapability("password", PASS);
        dc.setCapability("deviceQuery", "@os='ios'");
        dc.setCapability("waitForDeviceTimeout", waitForDeviceTimeout);
        dc.setCapability(IOSMobileCapabilityType.APP_NAME, appNameID);

        String url = "http://" + HOST + ":" + PORT + "/wd/hub";
        if (SECURE)
            url = "https://" + HOST + ":" + PORT + "/wd/hub";
        try {

            return new NewIOSDriver(new URL(url), dc);
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public NewAndroidDriver appiumAndroid(String appNameID) {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("testName", "Appium Android Audio Test");
        dc.setCapability("username", HOST);
        dc.setCapability("password", PASS);
        dc.setCapability("deviceQuery", "@os='android'");
        dc.setCapability("waitForDeviceTimeout", waitForDeviceTimeout);
        dc.setCapability(IOSMobileCapabilityType.APP_NAME, appNameID);

        String url = "http://" + HOST + ":" + PORT + "/wd/hub";
        if (SECURE)
            url = "https://" + HOST + ":" + PORT + "/wd/hub";
        try {

            return new NewAndroidDriver(new URL(url), dc);
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public NewIOSDriver appiumIOSAudio(String appNameID) {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("testName", "Appium IOS Audio Test");
        dc.setCapability("username", HOST);
        dc.setCapability("password", PASS);
        dc.setCapability("deviceQuery", "@os='ios'");
        dc.setCapability("waitForDeviceTimeout", waitForDeviceTimeout);
        dc.setCapability(IOSMobileCapabilityType.APP_NAME, appNameID);
        dc.setCapability("deviceWithAudio", true);

        String url = "http://" + HOST + ":" + PORT + "/wd/hub";
        if (SECURE)
            url = "https://" + HOST + ":" + PORT + "/wd/hub";
        try {

            return new NewIOSDriver(new URL(url), dc);
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public NewAndroidDriver appiumAndroidAudio(String appNameID) {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("testName", "Appium Android Test");
        dc.setCapability("username", HOST);
        dc.setCapability("password", PASS);
        dc.setCapability("deviceQuery", "@os='android'");
        dc.setCapability("waitForDeviceTimeout", waitForDeviceTimeout);
        dc.setCapability(IOSMobileCapabilityType.APP_NAME, appNameID);
        dc.setCapability("deviceWithAudio", true);

        String url = "http://" + HOST + ":" + PORT + "/wd/hub";
        if (SECURE)
            url = "https://" + HOST + ":" + PORT + "/wd/hub";
        try {

            return new NewAndroidDriver(new URL(url), dc);
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public NewIOSDriver appiumIOS(String appNameID, String UDID) {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("testName", "Appium IOS Test");
        dc.setCapability("username", HOST);
        dc.setCapability("password", PASS);
        dc.setCapability("deviceQuery", "@udid='" + UDID + "'");
        dc.setCapability("waitForDeviceTimeout", waitForDeviceTimeout);
        dc.setCapability(IOSMobileCapabilityType.APP_NAME, appNameID);

        String url = "http://" + HOST + ":" + PORT + "/wd/hub";
        if (SECURE)
            url = "https://" + HOST + ":" + PORT + "/wd/hub";
        try {

            return new NewIOSDriver(new URL(url), dc);
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public NewAndroidDriver appiumAndroid(String appNameID, String UDID) {
//        "com.experitest.ExperiBank"
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("testName", "Appium Android Test");
        dc.setCapability("username", HOST);
        dc.setCapability("password", PASS);
        dc.setCapability("deviceQuery", "@udid='" + UDID + "'");
        dc.setCapability("waitForDeviceTimeout", waitForDeviceTimeout);
        dc.setCapability(IOSMobileCapabilityType.APP_NAME, appNameID);

        String url = "http://" + HOST + ":" + PORT + "/wd/hub";
        if (SECURE)
            url = "https://" + HOST + ":" + PORT + "/wd/hub";
        try {

            return new NewAndroidDriver(new URL(url), dc);
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public GridClient gridClientShortConstructor() {
        if (SECURE)
            return new GridClient(USER, PASS, "Default", "https://" + HOST);
        return new GridClient(USER, PASS, "Default", "http://" + HOST);
    }

    public GridClient gridClientFullConstructor() {
        return new GridClient(USER, PASS, "Default", HOST, Integer.parseInt(PORT), SECURE);
    }

    public Client clientAndroid() {
        GridClient gridClient = new GridClient(USER, PASS, "Default", HOST, Integer.parseInt(PORT), SECURE);
        return gridClient.lockDeviceForExecution("GridClient Android", "@os='android'", 60, TimeUnit.MINUTES.toMillis(2));
    }

    public Client clientAndroid(int reservationTimeInMinutes, long timeout) {
        GridClient gridClient = new GridClient(USER, PASS, "Default", HOST, Integer.parseInt(PORT), SECURE);
        return gridClient.lockDeviceForExecution("GridClient Android", "@os='android'", reservationTimeInMinutes, TimeUnit.MINUTES.toMillis(timeout));
    }

    public Client clientIOS() {
        GridClient gridClient = new GridClient(USER, PASS, "Default", HOST, Integer.parseInt(PORT), SECURE);
        return gridClient.lockDeviceForExecution("GridClient IOS", "@os='ios'", 60, TimeUnit.MINUTES.toMillis(2));
    }

    public Client clientIOS(int reservationTimeInMinutes, long timeout) {
        GridClient gridClient = new GridClient(USER, PASS, "Default", HOST, Integer.parseInt(PORT), SECURE);
        return gridClient.lockDeviceForExecution("GridClient IOS", "@os='ios'", reservationTimeInMinutes, TimeUnit.MINUTES.toMillis(timeout));
    }

}