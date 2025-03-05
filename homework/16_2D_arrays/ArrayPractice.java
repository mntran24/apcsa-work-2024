public class ArrayPractice
{
    public static void main(String[] args)
    {
        int[][] array = {{3, 5, 7, 8, 0}, {500, 250, 125, 784, 267, 674, 0}, {9, 8, 0}};
        int totlen = 0;
        for (int[] each:array){totlen+=each.length;}
        // Call the updateValue method three times on this array:
        updateValue(array,0,array[0].length-1,array.length);
        updateValue(array,1,array[1].length-1,totlen);
        updateValue(array,2,array[2].length-1,array[0][0]+array[2][2]);
        print(array);
    }
    
    //Create a method to add the correct value to the array at the correct col, row
    public static void updateValue(int[][] arr, int row, int col, int value)
    {
        arr[row][col] = value;
    }
    
    public static void print(int[][] array)
    {
        System.out.print("{");
        for (int i = 0;i<array.length;i++){
            System.out.print("{");
            for(int x = 0;x<array[i].length;x++){
                System.out.print(array[i][x]);
                if (x<array[i].length-1){
                    System.out.print(", ");
                }
            }
            System.out.print("}");
            if (i<array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}