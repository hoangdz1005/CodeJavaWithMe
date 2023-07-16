package org.example.Cookies;

import org.json.Cookie;
import org.json.JSONObject;

public class CookiesJSON {
    public static void main(String[] args) {
        // Chuyển chuỗi Cookies thành JSONObject
        String cookie = "username=John Doe; expires=Thu, 18 Dec 2013 12:00:00 UTC; path=/";
        JSONObject cookieJO = Cookie.toJSONObject(cookie);
        System.out.println(cookieJO);

        // Chuyển JSONObject thành chuỗi cookies
        String cookie2 = Cookie.toString(cookieJO);
        System.out.println(cookie2);
    }
}
