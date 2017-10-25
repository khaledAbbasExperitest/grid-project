package Tests;

import com.experitest.client.Client;
import framework.ConnectionHandler;

/**
 * Created by ariel.hazan on 27-Sep-17.
 */
public class UICatalog extends BaseTest{
    public UICatalog() {

    }

    public void android() {
        Client client = new ConnectionHandler().clientAndroid();
        client.reboot(360000);
        client.install("C:\\GridProject\\grid-project\\Application\\UICatalog.apk", true, false);
        client.launch("com.experitest.UICatalog/.LoginActivity", false, true);

    }

    public void ios() {
        Client client = new ConnectionHandler().clientAndroid();
        client.reboot(360000);
        client.install("C:\\GridProject\\grid-project\\Application\\UICatalog.apk", true, false);
        client.launch("com.experitest.UICatalog", false, true);

    }
}
