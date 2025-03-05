import java.util.ArrayList;
import java.util.Arrays;

public class Driver{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Green","Eggs","And","Ham"));
        System.out.println(StringFormatter.totalLetters(list));
        System.out.println(StringFormatter.basicGapWidth(list,20));
        System.out.println(StringFormatter.leftoverSpaces(list,20));
        System.out.println(StringFormatter.format(list,20));
    }
}
