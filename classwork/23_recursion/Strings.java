public class Strings {
    public static void printString(String word){
        if(word.length()==1){
            System.out.print(word);
            return;
        }
        else{
            System.out.print(word.charAt(0));
            printString(word.substring(1));
            return;
        }
    }
    public static void printReverse(String word){
        if(word.length()==1){
            System.out.print(word);
            return;
        }
        else{
            System.out.print(word.charAt(word.length()-1));
            printReverse(word.substring(0,word.length()-1));
            return;
        }
    }
    public static int countChar(String word, char ch) {
        if(word.length()==1){
            if(word.charAt(0)==ch){
                return 1;
            }
            else{
                return 0;
            }
        }
        else{
            if(word.charAt(0)==ch){
                return 1 + countChar(word.substring(1), ch);
            }
            else{
                return 0 + countChar(word.substring(1), ch);
            }
        }
    }
    public static void main(String[] args) {
        printString("hello");
        System.out.println();
        printReverse("hello");
        System.out.println();
        System.out.println(countChar("hello", 'e'));
    }
}
