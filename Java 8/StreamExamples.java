// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        //Finding certain strings
        List<String> names1 = Arrays.asList("Anshul","Pragya","Ruheena","Pulin");

        long count = names1.stream().filter(name->name.length() < 6).count();
        System.out.println(count);

        //Iterating and displaying selected integers
        Stream.iterate(1, i->i+1)
        .filter(number->number%3==0)
        .limit(6)
        .forEach(System.out::println);

        //Concatenating two streams
        //list 1
        List<String> alphabets = Arrays.asList("A","B","C");
        //list 2
        List<String> names = Arrays.asList("Sansa","Jon","Arya");

        //creating two streams from the two lists and concatenating them into one
        Stream<String> opstream = Stream.concat(alphabets.stream(), names.stream());

        //displaying the elements of the concatenated stream
        opstream.forEach(str->System.out.print(str+" "));
    }
}
