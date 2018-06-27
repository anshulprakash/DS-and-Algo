/*
Source: https://beginnersbook.com/2017/10/java-8-stringjoiner/
*/

//Example 1: Joining strings by specifying delimiter
public class Example {
    public static void main(String[] args) {
    	// Passing Hyphen(-) as delimiter
        StringJoiner mystring = new StringJoiner("-");

        // Joining multiple strings by using add() method
        mystring.add("Logan");
        mystring.add("Magneto");
        mystring.add("Rogue");
        mystring.add("Storm");

        // Displaying the output String
        System.out.println(mystring);
    }
}
//Example 2: Adding prefix and suffix to the output String
public class Example {
    public static void main(String[] args) {
    	/* Passing comma(,) as delimiter and opening bracket
    	 * "(" as prefix and closing bracket ")" as suffix
    	 */
        StringJoiner mystring = new StringJoiner(",", "(", ")");

        // Joining multiple strings by using add() method
        mystring.add("Negan");
        mystring.add("Rick");
        mystring.add("Maggie");
        mystring.add("Daryl");

        // Displaying the output String
        System.out.println(mystring);
    }
}
