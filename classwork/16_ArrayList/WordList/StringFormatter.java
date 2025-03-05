import java.util.ArrayList;
public class StringFormatter{
    public static int totalLetters(ArrayList<String> wordList){
        int tot = 0;
        for (int i = 0;i<wordList.size();i++){
            tot += wordList.get(i).length();
        }
        return tot;
    }
    public static int basicGapWidth(ArrayList<String> wordList, int formattedLen){
        return (formattedLen - totalLetters(wordList))/(wordList.size()-1);
    }
    public static int leftoverSpaces(ArrayList<String> wordList, int formattedLen){
        return (formattedLen - totalLetters(wordList) - basicGapWidth(wordList,formattedLen)*(wordList.size()-1));
    }
    public static String format(ArrayList<String> wordList, int formattedLen){
        String res = "";
        for (int i = 0;i<wordList.size();i++){
            res+=wordList.get(i);
            for (int x = 0;x<basicGapWidth(wordList,formattedLen);x++){
                res+=" ";
            }
            if (i<leftoverSpaces(wordList,formattedLen)){
                res+=" ";
            }
        }
        return res;
    }
}
