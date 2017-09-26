package framework;

import com.experitest.client.GridClient;

/**
 * Created by ariel.hazan on 26-Sep-17.
 */
public class NewGridClient extends GridClient{

    public NewGridClient(String userName, String password, String projectName) {
        super(userName, password, projectName);
    }

    public NewGridClient(String userName, String password, String projectName, String domain, int port, boolean isSecured) {
        super(userName, password, projectName, domain, port, isSecured);
    }

    public NewGridClient(String userName, String password, String projectName, String url) {
        super(userName, password, projectName, url);
    }

    public NewGridClient(String accessKey, String url) {
        super(accessKey, url);
    }

    public NewGridClient(String accessKey, String domain, int port, boolean isSecured) {
        super(accessKey, domain, port, isSecured);
    }
}
