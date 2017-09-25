package main.java.framework;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ariel Hazan on 9/24/2017.
 */
public class GridFactory {

//    IOSDriver driver;


    public GridFactory(String s){

    }


//    public void appiumIOS() {
//        DesiredCapabilities dc = new DesiredCapabilities();
//        dc.setCapability("testName", ConfigureFile.TestName + testName);
//        dc.setCapability("username", ConfigureFile.userName);
//        dc.setCapability("password", ConfigureFile.userPassword);
//        dc.setCapability("deviceQuery", "@os='ios'");
//        //dc.setCapability("deviceQuery", "@udid='6d83af5fee3f5f393e9d9eaa99aaa5f7a839b911'");
//        dc.setCapability("waitForDeviceTimeout", 1000 * 360);
//        dc.setCapability(IOSMobileCapabilityType.APP_NAME, "com.experitest.ExperiBank");
//
//        String url = "http://" + ConfigureFile.cloudName + ":" + ConfigureFile.cloudPort + "/wd/hub";
//        if (ConfigureFile.isSecure)
//            url = "https://" + ConfigureFile.cloudName + ":" + ConfigureFile.cloudPort + "/wd/hub";
//        try{
//
//            driver = new IOSDriver(new URL(url), dc);
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
    public void appiumAndroid(){

    }
}