package framework;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.Capabilities;

import java.net.URL;

/**
 * Created by ariel.hazan on 25-Sep-17.
 */
public class NewIOSDriver extends IOSDriver{
    public NewIOSDriver(URL remoteAddress, Capabilities desiredCapabilities) {
        super(remoteAddress, desiredCapabilities);
    }

}
