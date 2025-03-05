public class MyStrings
{
    public static void main(String[] args)
    {
        // Remember the first letter of an String starts at position 0 (ZERO)
        
       String msg = "The people who are crazy enough to think they can change the world are the ones who do."; 
       System.out.println("My message:\n" + msg);

       // Print the length of msg
       System.out.println("Length of message: " + msg.length());
       
       String firstSubs = msg.substring(4, 10);
       System.out.println("msg.substring(4, 10): " + firstSubs);
       // What is the outuput? 
       // people
       // Are characters 4 and 10 included?
       // 4 is included, 10 isn't
       // Print the lenght of firstSub
       System.out.println("Length of firstSub: "+firstSubs.length());

       String secondSubs = msg.substring(41);
       System.out.println("msg.substring(41): " + secondSubs);
       // What is the outuput?
       // they can change the world are the ones who do.
       // Is the character 41 included?
       // yes
       // Print the lenght of secodSubs
       System.out.println("Length of secondSub: "+secondSubs.length());
       // Get and print the word people
       String get = msg.substring(4,10);
       System.out.println("The word people: "+get);
       // Get and print the last three characters of msg
       String last3 = msg.substring(msg.length()-3);
       System.out.println("Last 3 chars: "+last3);

       System.out.println("firstSubs: " + firstSubs);
       System.out.println("secondSubs: " + secondSubs);

       System.out.println("firstSubs.equals(secondSubs): " + firstSubs.equals(secondSubs));
        // What is the result of the comparisson?
        // false
        // Create a new String object newStr and assign a value. Requirement: firstSubs.equals(newStr) should be True
        String newstring = "people";
        // REMEMBER DO NOT USE == TO COMPARE STRINGS

        System.out.println( "msg.charAt(0) is: " + msg.charAt(0));
        // What is the output?
        // T
        // Print the last character of msg using the method charAt()
        System.out.println("Last character: "+msg.charAt(msg.length()-1));

        // YOU CAN COMPARE CHARACTERS USING ==
        System.out.println("msg.charAt(0) == \'A\': ");
        System.out.println(msg.charAt(0) == 'A'); 

    }
}