package framework;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Capabilities;

import java.net.URL;

/**
 * Created by ariel.hazan on 25-Sep-17.
 */
public class NewAndroidDriver extends AndroidDriver {
    public NewAndroidDriver(URL remoteAddress, Capabilities desiredCapabilities) {
        super(remoteAddress, desiredCapabilities);
    }
}
