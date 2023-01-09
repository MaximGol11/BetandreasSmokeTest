package helpers;

import java.util.Date;

public class Utils {

    public static String userEmailGenerator() {
        Date currentTime = new Date();
        return currentTime.getTime() + "_test@test.com";
    }

    public static String userMobilePhoneGenerator() {
        Date currentTime = new Date();
        return currentTime.getTime() + "";
    }
}
