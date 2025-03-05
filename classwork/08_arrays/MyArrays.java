public class MyArrays{
    public static String arrayToString(int[] array){
        String res = "[";
        for (int item:array){
            res+= item + ",";
        }
        String ret = res.substring(0,res.length()-1)+"]";
        return ret;
    }
    public static void main(String[] args){
        int[] arr = {4,56,23,9494};
        System.out.println(arrayToString(arr));
    }
    
}