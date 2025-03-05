public class MyStringMethods{

    // Explain how IndexOf method works in a few sentences
    // indexOf() searches the string for the first instance of the target string and returns the index of this instance. If the target string isn't found, return -1.
    // Then implement your own myIndexOf
    public static int myIndexOf(String myString, String targetString){
        for (int i = 0;i<myString.length();i++){
            if (i+targetString.length()>myString.length()){
                return -1;
            }
            if (myString.substring(i,i+targetString.length()).equals(targetString)){
                return i;
            }
        }
        return -1;
    }                             
  
    // Explain how CompareTo method works in a few sentences/
    // compareTo() goes through each character of both strings and compares their ASCII values. The difference of the values is returned when it's non-zero. 
    // If the two strings are the same, return 0. If one string has fewer characters than the other string, it returns the length of the first string minus the length of the second string.
    // Then implement your own myCompareTo
    public static int myCompareTo(String myString, String otherString){
        int length1 = myString.length();
        int length2 = otherString.length();
        for (int i=0;i<Math.min(length1,length2);i++){
            if (myString.charAt(i)-otherString.charAt(i)!=0){
                return myString.charAt(i)-otherString.charAt(i);
            }
        }
        if (length1==length2){
            return 0;
        }
        else{
            return length1 - length2;
        }
    }
  
    // Explain how parseInt method works in a few sentences/
    // parseInt() goes through each character from right to left, converts the character into an integer, and adds that integer * the correct place value to the final result. 
    // If the string contains a negative sign, the result will be negated before being returned.
    // Note that the actual parseInt() method only works for strings that only contains integers (the string cannot contain letters, decimal points, etc.) so I didn't check each character to be a digit.
    // If the input is invalid, it'll throw an exception.
    // Then implement your own myParseInt()
   public static int myparseInt(String myString){
    int count = 0;
    int res = 0;
        for (int i = myString.length()-1;i>=0;i--){
            char xx = myString.charAt(i);
            if (xx !='-'){
                int add = (int) xx - 48;
                res += (add*Math.pow(10,count));
                count++;
            }
            else{
                res = 0-res;
            }
        }
        return res;
   }
   public static void main(String[] args){
    String string1 = "hello";
    String string2 = "hellopppp";
    String string3 = "4763875";
    System.out.println(myIndexOf(string1,string2));
    System.out.println(myCompareTo(string1,string2));
    System.out.println(myparseInt(string3));
   }
}
