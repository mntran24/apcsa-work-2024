import java.util.ArrayList;
public class Driver {
    public static void main(String[] args)
    {
     	// Array of strings
        String[] words = {"Hi", "there", "Tyler", "Sam", "Hi", "there"};
        String[] test = {"hi","bye","hi"};
        String[] testt = {"h","bye","hi"};
        
        // Create an ArrayList with words pairs
        WordPairList list = new WordPairList(words);
        WordPairList testy = new WordPairList(test);
        WordPairList testty = new WordPairList(testt);
        
        // Print the list
        System.out.println(list.toString());
        
        // Print number of matched pairs
        System.out.println("The number of matched pairs is: " + list.numMatches());
        System.out.println("The number of matched pairs is: " + testy.numMatches());
        System.out.println("The number of matched pairs is: " + testty.numMatches());
        
        // ADD MORE TEST CASES (at least 2 more)
    }
}
