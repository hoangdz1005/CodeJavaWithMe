package org.example.CDL;

import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONTokener;

public class CDLExam {
    public static void main(String[] args) {
        // Chuyển văn bản chứa dấu phẩy thành JSON
        JSONArray ja = CDL.rowToJSONArray(new JSONTokener("England, USA, Canada"));
        System.out.println(ja);

        // Đảo ngược bước trên
        JSONArray jsonArray = new JSONArray("[\"England\",\"USA\",\"Canada\"]");
        String cdt = CDL.rowToString(jsonArray);
        System.out.println(cdt);

        // Chuyển String thành JSONArray
        String string = "name, city, age \n" +
                "john, chicago, 22 \n" +
                "gary, florida, 35 \n" +
                "sal, vegas, 18";

        JSONArray result = CDL.toJSONArray(string);
        System.out.println(result);
    }
}
