package comswatisingh0960.httpsgithub.restaurantmap.utils;

import org.scribe.builder.api.DefaultApi10a;
import org.scribe.model.Token;

/**
 * Created by Swati on 11/29/2016.
 */

public class TwoStepOAuth extends DefaultApi10a {

    private static final String CONSUMER_KEY = "_OCgRiBEiGZ6s_TWfWxPOw";
    private static final String CONSUMER_SECRET = "KgkUf9Zz7j7YG0fovpv7cVgWvgw";
    private static final String TOKEN = "3zNkfG9ehlVy_LUTKobXhxuB4T2HIdPB";
    private static final String TOKEN_SECRET = "NkpPLDyIQpwNtXmva2W_TiPnxfw";

    public static String getConsumerKey() {
        return CONSUMER_KEY;
    }

    public static String getConsumerSecret() {
        return CONSUMER_SECRET;
    }

    public static String getToken() {
        return TOKEN;
    }

    public static String getTokenSecret() {
        return TOKEN_SECRET;
    }

    @Override
    public String getAccessTokenEndpoint() {
        return null;
    }

    @Override
    public String getAuthorizationUrl(Token arg0) {
        return null;
    }

    @Override
    public String getRequestTokenEndpoint() {
        return null;
    }
}