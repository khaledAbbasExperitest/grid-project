package framework;

import com.experitest.client.GridClient;

/**
 * Created by khaled.abbas on 9/24/2017.
 */
public class GridClienttExtendedClient extends GridClient{

    public GridClienttExtendedClient(String userName, String password, String projectName) {
        super(userName, password, projectName);
    }

    public GridClienttExtendedClient(String userName, String password, String projectName, String domain, int port, boolean isSecured) {
        super(userName, password, projectName, domain, port, isSecured);
    }

    public GridClienttExtendedClient(String userName, String password, String projectName, String url) {
        super(userName, password, projectName, url);
    }

    public GridClienttExtendedClient(String accessKey, String url) {
        super(accessKey, url);
    }

    public GridClienttExtendedClient(String accessKey, String domain, int port, boolean isSecured) {
        super(accessKey, domain, port, isSecured);
    }
}
