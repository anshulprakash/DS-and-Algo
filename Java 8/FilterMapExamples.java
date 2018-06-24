/*
  Source: https://beginnersbook.com/2017/10/java-8-filter-a-map-by-keys-and-values/
*/
//Filter Map by Keys

public class Example {
   public static void main(String[] args) {
      Map<Integer, String> hmap = new HashMap<Integer, String>();
      hmap.put(11, "Apple");
      hmap.put(22, "Orange");
      hmap.put(33, "Kiwi");
      hmap.put(44, "Banana");

      Map<Integer, String> result = hmap.entrySet()
      .stream()
      .filter(map -> "Orange".equals(map.getValue()))
      .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

      System.out.println("Result: " + result);
   }
}

// Filter Map by both Keys and Values

public class Example {
   public static void main(String[] args) {
      Map<Integer, String> hmap = new HashMap<Integer, String>();
      hmap.put(1, "ABC");
      hmap.put(2, "XCB");
      hmap.put(3, "ABB");
      hmap.put(4, "ZIO");

      Map<Integer, String> result = hmap.entrySet()
         .stream()
         .filter(p -> p.getKey().intValue() <= 2) //filter by key
         .filter(map -> map.getValue().startsWith("A")) //filter by value
         .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

     System.out.println("Result: " + result);
   }
}
