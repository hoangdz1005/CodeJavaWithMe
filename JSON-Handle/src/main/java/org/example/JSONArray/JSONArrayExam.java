package org.example.JSONArray;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JSONArrayExam {
    public static void main(String[] args) {
        JSONArray jsonArray = new JSONArray();
        jsonArray.put(Boolean.TRUE);
        jsonArray.put("coding JSON");
        JSONObject jo = new JSONObject();
        jo.put("name", "john");
        jo.put("age", "30");
        jo.put("country", "US");
        jsonArray.put(jo);
        System.out.println(jsonArray);

        // Tạo JSONArray từ Collection hoặc Array
        List<String> list = new ArrayList<>();
        list.add("California");
        list.add("Texas");
        list.add("Hawaii");
        list.add("Alaska");
        JSONArray ja = new JSONArray(list);
        System.out.println(ja);
    }
}
