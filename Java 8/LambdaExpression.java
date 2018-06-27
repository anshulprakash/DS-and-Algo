
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("January");
        list.add("June");
        list.add("December");
        list.forEach(
            (month) -> System.out.println(month)
        );

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Jan");
        map.put(2, "Feb");
        map.put(3, "Mar");
        map.put(4, "Apr");

        map.forEach(
            (key, value) -> System.out.println(value + " is " + key)
        );
    }
}
