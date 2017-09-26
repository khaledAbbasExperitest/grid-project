package framework;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.remote.http.HttpClient;

import java.net.URL;

/**
 * Created by ariel.hazan on 25-Sep-17.
 */

public class NewIOSDriver extends IOSDriver {


    public NewIOSDriver(HttpCommandExecutor executor, Capabilities capabilities) {
        super(executor, capabilities);
    }

    public NewIOSDriver(URL remoteAddress, Capabilities desiredCapabilities) {
        super(remoteAddress, desiredCapabilities);
    }

    public NewIOSDriver(URL remoteAddress, HttpClient.Factory httpClientFactory, Capabilities desiredCapabilities) {
        super(remoteAddress, httpClientFactory, desiredCapabilities);
    }

    public NewIOSDriver(AppiumDriverLocalService service, Capabilities desiredCapabilities) {
        super(service, desiredCapabilities);
    }

    public NewIOSDriver(AppiumDriverLocalService service, HttpClient.Factory httpClientFactory, Capabilities desiredCapabilities) {
        super(service, httpClientFactory, desiredCapabilities);
    }

    public NewIOSDriver(AppiumServiceBuilder builder, Capabilities desiredCapabilities) {
        super(builder, desiredCapabilities);
    }

    public NewIOSDriver(AppiumServiceBuilder builder, HttpClient.Factory httpClientFactory, Capabilities desiredCapabilities) {
        super(builder, httpClientFactory, desiredCapabilities);
    }

    public NewIOSDriver(HttpClient.Factory httpClientFactory, Capabilities desiredCapabilities) {
        super(httpClientFactory, desiredCapabilities);
    }

    public NewIOSDriver(Capabilities desiredCapabilities) {
        super(desiredCapabilities);
    }
}
