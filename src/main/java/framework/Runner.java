package framework;

/**
 * Created by khaled.abbas on 9/24/2017.
 */

public class Runner {

    private CloudServerName cloudName;
    String HOST, PASS, USER, PORT;
    boolean SECURE;

    public enum CloudServerName {
        NAVOT, QA, MIRRON, PUBLIC, EYAl, QA_Not_Secured, MY_N_S, ARIEL_WIN, ARIEL_MAC, YEHUDA
    }

    public void updateCloudDetails() {
        switch (cloudName) {
            case NAVOT:
                HOST = "192.168.2.13";
                PORT = "80";
                USER = "admin";
                PASS = "Experitest2012";
                SECURE = false;
                break;
            case ARIEL_MAC:
                HOST = "192.168.2.91";
                PORT = "8888";
                USER = "admin";
                PASS = "Experitest2012";
                SECURE = false;
                break;
            case ARIEL_WIN:
                HOST = "192.168.2.108";
                PORT = "1111";
                USER = "admin";
                PASS = "Experitest2012";
                SECURE = false;
                break;
            case MY_N_S:
                HOST = "192.168.2.13";
                PORT = "8090";
                USER = "admin";
                PASS = "Experitest2012";
                SECURE = false;
                break;
            case YEHUDA:
                HOST = "192.168.2.31";
                PORT = "1111";
                USER = "yehuda";
                PASS = "Experitest2012";
                SECURE = false;
                break;
            case QA:
                HOST = "qacloud.experitest.com";
                PORT = "443";
                USER = "zekra";
                PASS = "Zekra1234";
                SECURE = false;
                break;
            case QA_Not_Secured:
                HOST = "192.168.2.135";
                PORT = "80";
                USER = "zekra";
                PASS = "Zekra1234";
                SECURE = false;
                break;
            case MIRRON:
                HOST = "192.168.2.71";
                PORT = "8080";
                USER = "user1";
                PASS = "Welc0me!";
                SECURE = false;
                break;
            case PUBLIC:
                HOST = "https://cloud.experitest.com";
                PORT = "443";
                USER = "dikla";
                PASS = "Experitest2012";
                SECURE = false;
                break;
            case EYAl:
                HOST = "eyalneumann.experitest.local";
                PORT = "8091";
                USER = "admin";
                PASS = "Experitest2012";
                SECURE = false;
                break;

            default:
                HOST = "192.168.2.13";
                PORT = "80";
                USER = "admin";
                PASS = "Experitest2012";
                SECURE = false;
                break;
        }
    }
}
