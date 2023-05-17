package BaiThucHanh1005;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide88 {
    public static void main(String[] args) {
        HashMap<String, String> hashMapCity = new HashMap<>();
        hashMapCity.put("QNg", "quang ngai");
        hashMapCity.put("ON", "Quang Nam");
        hashMapCity.put("ON", "Quang Ninh");
        hashMapCity.put("HCM", "thanh pho ho chi minh");
        System.out.println("Danh sách các thành phố trong hashMapCity: ");
        Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);

        if (hashMapCity.containsValue("thanh pho ho chinh minh")) {
            System.out.println("co thanh pho ho chi minh trong hashMapCity");
        }
    }
}