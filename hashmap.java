// hashmap

import java.util.HashMap;
import java.util.Map;
import java.util.Set;



class hashmaP {
    public static void main(String[] args) {
        // Example = country(key) , population(values )
        HashMap<String, Integer> map = new HashMap<>();

//        The HashMap class has many useful methods. For example, to add items to it, use the put() method:
        map.put("India", 140);
        map.put("China ", 150);
        map.put("Pakistan", 22);
        map.put("America", 67);
        System.out.println(map);

        map.put("India", 150);
        System.out.println(map);

        // Search in hashmap

        if (map.containsKey("India")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not present ");
        }
//        To access a value in the HashMap, use the get() method and refer to its key:
        System.out.println(map.get("China "));// key present
        System.out.println(map.get("Russia "));// key doesnot present

        // New way of for loop
        /*
         * int arr[] = { 12, 13, 14, 16, 12 };
         * for (int i = 0; i < arr.length; i++) {
         * System.out.print(arr[i] + " ");
         * }
         * System.out.println();
         *
         * for (int val : arr) {
         * System.out.print(val + " ");
         * }
         * System.out.println();
         */
        // Traversing by for loop in the hashmap
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        // USing keySet keyworg
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        // TO REMOVE VALUES AND KEY
        map.remove("China ");
        System.out.println(map);
    }
}
