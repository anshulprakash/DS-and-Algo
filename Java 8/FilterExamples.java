/*Source: https://beginnersbook.com/2017/10/java-8-stream-filter/ */

// A Simple Example of Java Stream Filter()

public class Example {
   public static void main(String[] args) {

	List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

	//Creating the stream of all names
	Stream<String> allNames = names.stream();

	//Creating another stream by filtering long names using filter()
	Stream<String> longNames = allNames.filter(str -> str.length() > 6);

	//displaying the long names
	longNames.forEach(str->System.out.print(str+" "));
  }
}

//Example 1: Stream filter() and collect()

public class Example {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

        List<String> longnames = names.stream()    // converting the list to stream
                .filter(str -> str.length() > 6)   // filter the stream to create a new stream
                .collect(Collectors.toList());  // collect the final stream and convert it to a List

        longnames.forEach(System.out::println);

    }

}

// Example 2: Stream filter() with multiple conditions

public class Example {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

        List<String> longnames = names.stream()
                .filter(str -> str.length() > 6 && str.length() < 8) //Multiple conditions
                .collect(Collectors.toList());

        longnames.forEach(System.out::println);

    }

}

// Example 3: Stream filter() and map() method in Java

public class Example {

    public static void main(String[] args) {

    	List<Integer> num = Arrays.asList(1,2,3,4,5,6);
        List<Integer> squares = num.stream()
        		.map(n -> n * n)
        		.collect(Collectors.toList());
        System.out.println(squares);

    }

}
