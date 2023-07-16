package org.example.JSONObject;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JSONObjectExam {
    public static void main(String[] args) {
        // Tạo JSON trực tiếp từ JSONObject
        JSONObject jo = new JSONObject();
        jo.put("name", "alice");
        jo.put("age", "22");
        jo.put("country", "england");
        System.out.println(jo);

        // Tạo JSON từ Map (ko theo thứ tự)
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "bob");
        map.put("age", "25");
        map.put("country", "vietnam");
        JSONObject jo2 = new JSONObject(map);
        System.out.println(jo2);

        // Tạo JSONObjetc từ JSON String
        JSONObject jo3 = new JSONObject(
                "{\"country\":\"china\",\"name\":\"wulei\",\"age\":\"22\"}"
        );
        System.out.println(jo3);
    }
}
