package Class9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PropertyTest {

    public static void main(String[] arg) {
        List<Map<String, Object>> dataList = new ArrayList<>();
        Map<String, Object> appleMap = new HashMap<>();
        appleMap.put("Items", "Apple");
        appleMap.put("Price", 20.00);
        appleMap.put("Quantity", 10);
        dataList.add(appleMap);
        Map<String, Object> orangeMap = new HashMap<>();
        orangeMap.put("Items", "Orange");
        orangeMap.put("Price", 21.99);
        orangeMap.put("Quantity", 10);
        dataList.add(orangeMap);
        double subtotal = 0;
        double sum = 0;
        for (Map<String, Object> map : dataList) {
            Object price = map.get("Price");
           double eachprice = (double) price;

            Object quantity = map.get("Quantity");
            double eachquantity =(double)quantity;

            Object item = map.get("Items");
            String eachitem = (String)item;
            subtotal = eachprice * eachquantity;
            sum += subtotal;
            System.out.println("Items: " + item + " Price: " + eachprice + " Quantity: " + eachquantity + " SubTotal: " + subtotal);
            System.out.println();

        }
        System.out.println("Your Purchase total : " + sum);

    }


}
