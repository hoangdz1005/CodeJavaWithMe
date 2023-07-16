package org.example.HTTP;

import org.json.HTTP;
import org.json.JSONObject;

public class HTTPExam {
    public static void main(String[] args) {
        // Chuyển JSONObject thành HTTP Header String
        JSONObject jo = new JSONObject();
        jo.put("Method", "POST");
        jo.put("Request-URI", "http://www.example.com/");
        jo.put("HTTP-Version", "HTTP/1.1");
        String httpStr = HTTP.toString(jo);
        System.out.println(httpStr);

        // Convert ngược lại
        JSONObject obj = HTTP.toJSONObject("POST \"http://www.example.com/\" HTTP/1.1");
        System.out.println(obj);
    }
}
