package framework;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.remote.http.HttpClient;

import java.net.URL;

/**
 * Created by ariel.hazan on 25-Sep-17.
 */
public class NewAndroidDriver extends AndroidDriver {

    public NewAndroidDriver(HttpCommandExecutor executor, Capabilities capabilities) {
        super(executor, capabilities);
    }

    public NewAndroidDriver(URL remoteAddress, Capabilities desiredCapabilities) {
        super(remoteAddress, desiredCapabilities);
    }

    public NewAndroidDriver(URL remoteAddress, HttpClient.Factory httpClientFactory, Capabilities desiredCapabilities) {
        super(remoteAddress, httpClientFactory, desiredCapabilities);
    }

    public NewAndroidDriver(AppiumDriverLocalService service, Capabilities desiredCapabilities) {
        super(service, desiredCapabilities);
    }

    public NewAndroidDriver(AppiumDriverLocalService service, HttpClient.Factory httpClientFactory, Capabilities desiredCapabilities) {
        super(service, httpClientFactory, desiredCapabilities);
    }

    public NewAndroidDriver(AppiumServiceBuilder builder, Capabilities desiredCapabilities) {
        super(builder, desiredCapabilities);
    }

    public NewAndroidDriver(AppiumServiceBuilder builder, HttpClient.Factory httpClientFactory, Capabilities desiredCapabilities) {
        super(builder, httpClientFactory, desiredCapabilities);
    }

    public NewAndroidDriver(HttpClient.Factory httpClientFactory, Capabilities desiredCapabilities) {
        super(httpClientFactory, desiredCapabilities);
    }

    public NewAndroidDriver(Capabilities desiredCapabilities) {
        super(desiredCapabilities);
    }
}
