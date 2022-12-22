package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;
import java.util.Map;

/**
 *  HashMaps Exercise_01
 *
 *  Demonstrate your mastery of using Java's built-in HashMap class below.
 *
 *  Using a HashMap demonstrate the use of the following methods:
 *
 *  put()
 *  get()
 *  putAll()
 *  size()
 *  contains()
 *  keySet()
 *  entrySet()
 *  putIfAbsent()
 *  remove()
 *  replace()
 *  forEach()
 *  clear()
 *
 */

class Exercise_01{

    public static void main(String[] args) {
        Map<Integer, String> mapDemo = new HashMap<>();

        mapDemo.put(1,"One");
        mapDemo.put(2,"Two");
        mapDemo.put(3,"Three");
        mapDemo.put(4,"Four");

        Map<Integer, String> subMap = new HashMap<>();
        subMap.put(5,"Five");
        subMap.put(6,"Six");
        subMap.put(7,"Seven");

        mapDemo.putAll(subMap);

        System.out.println(mapDemo.get(1));

        System.out.println(mapDemo.size());

        System.out.println(mapDemo.containsKey(4));
        System.out.println(mapDemo.containsValue("Four"));

        for (Integer key : mapDemo.keySet()){
            System.out.println(key);
        }

        for (String val : mapDemo.values()){
            System.out.println(val);
        }

        for (Map.Entry<Integer, String> entry : mapDemo.entrySet()){
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        mapDemo.putIfAbsent(8,"Eight");

        mapDemo.remove(1);

        mapDemo.replace(7, "Nine");

        mapDemo.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));

        mapDemo.clear();

    }
}