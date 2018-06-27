/*
url: https://dzone.com/articles/java-8-comparator-how-to-sort-a-list
*/

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {

        /*Sort a List of Strings Alphabetically*/
        List<String> cities = Arrays.asList("Dallas", "Zurich", "Austin","london","Houston");
        System.out.println(cities);

        //Ignores case while sorting
        cities.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(cities);
        //lowercase after uppercase
        cities.sort(Comparator.naturalOrder());
        System.out.println(cities);

        /*Sort a List of Integers*/
        List<Integer> numbers = Arrays.asList(6, 2, 1, 7, 3);
        System.out.println(numbers);

        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);

        /*Sort a List by String Field*/
        List<Movie> movies = Arrays.asList(
        new Movie("Lord of the rings"),
        new Movie("Back to the future"),
        new Movie("Carlito's way"),
        new Movie("Pulp fiction"));

        System.out.println(movies);
        //Both does the same thing
        movies.sort(Comparator.comparing(Movie::getTitle));
        movies.sort((m1,m2)->{
            return m1.title.compareTo(m2.title);
        });

        System.out.println(movies);

        /* Sort a list by double field */
        List<Movie> moviesWithRatings = Arrays.asList(
        new Movie("Lord of the rings", 8.8),
        new Movie("Back to the future", 8.5),
        new Movie("Carlito's way", 7.9),
        new Movie("Pulp fiction", 8.9));

        System.out.println(moviesWithRatings);

        moviesWithRatings.sort(Comparator.comparingDouble(Movie::getRating).reversed());
        System.out.println(moviesWithRatings);

        /*Sort a List With a Custom Comparator*/
        List<Movie> movies = Arrays.asList(
        new Movie("Lord of the rings", 8.8, true),
        new Movie("Back to the future", 8.5, false),
        new Movie("Carlito's way", 7.9, true),
        new Movie("Pulp fiction", 8.9, false));

        movies.sort(new Comparator<Movie>(){
            @Override
            public int compare(Movie m1, Movie m2){
                if(m1.getStarred() == m2.getStarred()){
                    return 0;
                }
                return m1.getStarred() ? -1 : 1;
            }
        });
        //use a lambda expression instead of Anonymous class as follow
        movies.sort((m1, m2) -> {
            if(m1.getStarred() == m2.getStarred()){
                return 0;
            }
            return m1.getStarred() ? -1 : 1;
        });
        //use again Comparator.comparing()
        movies.sort(Comparator.comparing(Movie::getStarred, (star1, star2) -> {
            if(star1 == star2){
                 return 0;
            }
            return star1 ? -1 : 1;
        }));

        /*Sort a List With Chain of Comparator*/

        List<Movie> movies = Arrays.asList(
                new Movie("Lord of the rings", 8.8, true),
                new Movie("Back to the future", 8.5, false),
                new Movie("Carlito's way", 7.9, true),
                new Movie("Pulp fiction", 8.9, false));
        movies.sort(Comparator.comparing(Movie::getStarred)
                              .reversed()
                              .thenComparing(Comparator.comparing(Movie::getRating)
                              .reversed())
        );
        movies.forEach(System.out::println);
    }
}

class Movie{
    String title;
    double rating;
    boolean starred;

    Movie(String title){
        this.title = title;
    }

    Movie(String title, double rating){
        this.title = title;
        this.rating = rating;
    }

    Movie(String title, double rating, double starred){
        this.title = title;
        this.rating = rating;
        this.starred = starred;
    }

    Movie(){

    }
    @Override
    public String toString() {
        return title;
    }

    String getTitle(){
        return title;
    }

    double getRating(){
        return rating;
    }

    boolean getStarred(){
        return getStarred;
    }
}
