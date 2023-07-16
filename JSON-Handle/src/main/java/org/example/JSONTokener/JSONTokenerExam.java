package org.example.JSONTokener;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.util.logging.Logger;

public class JSONTokenerExam {
    public static void main(String[] args) {
        String jsonString = "{\"name\": \"John Doe\", \"age\": 30, \"isStudent\": false}";
        try {
            JSONTokener tokener = new JSONTokener(jsonString);
            JSONObject jsonObject = new JSONObject(tokener);

            // Truy cập các giá trị từ JSONObject
            String name = jsonObject.getString("name");
            int age = jsonObject.getInt("age");
            boolean isStudent = jsonObject.getBoolean("isStudent");

            // Hiển thị kết quả
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Is Student: " + isStudent);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
