public class ArrayMethods
{
    public static void main(String[] args)
    {
      // Create test cases here
      int[][] test1 = new int[][] {{8, 4, 2}, {1, 0, 9}, {5, 7, 8}};
      int[][] test2 = new int[][] {{1, 2, 3}, {4, 5, 6}};
      print(test1);
      System.out.println(findSum(test1));
      print(transpose(test2));
    }
    
    
    public static void print(int[][] array){
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
  
    public static int findSum(int[][] array){
        int sum = 0;
        for (int[] item:array){
            for (int i:item){
                sum+=i;
            }
        }
        return sum;
    }
        

    public static int[][] transpose(int[][] array){
        int[][] arr = new int[array[0].length][array.length];
        for (int i = 0;i<arr.length;i++){
            for(int x = 0;x<arr[i].length;x++){
                arr[i][x] = array[x][i];
            }
        }
        return arr;
    } 
  
}