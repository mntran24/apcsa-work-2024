public class TwoDArrayPractice
{

  public static void main(String[] args)
    {
      // Create test cases here.
      String test = "jfdhja hljk eweru";
      int rows = 3;
      int cols = 4;
      int[][] test1 = new int[][] {{8, 4, 2}, {1, 0, 9}, {5, 7, 8}};
      int[][] test2 = new int[][] {{1, 2, 3}, {4, 5, 6}};
      print(new String[rows][cols]);
      print(fillRows(test, rows, cols));
      printIntArr(test1);
      printIntArr(rowSwap(test1, 1, 0));
      printIntArr(test2);
      printIntArr(colSwap(test2, 1, 2));
      // Print the status of your 2D array before and after
      // invoking a method. You will need to add a print() method
      // to avoid duplicated code in your main.
    }

    /*
     * Swaps all values in the specified 2 rows of array.
    */
    public static int[][] rowSwap(int[][] array, int rowAIndex, int rowBIndex)
    {
        // Yor code here
        int[] ref = array[rowAIndex];
        array[rowAIndex] = array[rowBIndex];
        array[rowBIndex] = ref;
        return array;
    }

  
    /**
     * Swaps all values in the specified 2 columns of array.
     */
    public static int[][] colSwap(int[][] array, int colAIndex, int colBIndex)
    {
        // Your code her
        for (int[] arr:array){
            int ref = arr[colAIndex];
            arr[colAIndex] = arr[colBIndex];
            arr[colBIndex] = ref;
        }
        return array;
    }

  
    /*
     * Returns an array with the specified number of rows and columns
     * containing the characters from str in row-major order. If str.length()
     * is greater than rows * cols, extra characters are ignored. If
     * str.length() is less than rows * cols, the remaining elements in the
     * returned array contain null.

     Examples:

      String[][] result = fillRows("Happy Halloween", 3, 4);
      
      result (after method call):
      "H"     "a"     "p"     "p"
      "y"     " "     "H"     "a"
      "l"     "l"     "o"     "w"
      
      
      String[][] result = fillRows("hello", 3, 4);
      
      result (after method call):
      "h"     "e"     "l"     "l"
      "o"     null    null    null
      null    null    null    null

     */
    public static String[][] fillRows(String str, int rows, int cols)
    {
        String[][] res = new String[rows][cols];
        for (int i = 0;i<Math.min(rows*cols,str.length());i++){
            res[i/cols][i%cols] = ""+str.charAt(i);
        }
        return res;
    }

    public static void print(String[][] array){
        System.out.print("[");
        for (int i = 0;i<array.length;i++){
            System.out.print("[");
            for(int x = 0;x<array[i].length;x++){
                System.out.print(array[i][x]);
                if (x<array[i].length-1){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            if (i<array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void printIntArr(int[][] array){
        System.out.print("[");
        for (int i = 0;i<array.length;i++){
            System.out.print("[");
            for(int x = 0;x<array[i].length;x++){
                System.out.print(array[i][x]);
                if (x<array[i].length-1){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            if (i<array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
  
}    