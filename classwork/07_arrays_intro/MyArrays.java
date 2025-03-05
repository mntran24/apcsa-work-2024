public class MyArrays
{
    public static void main(String[] args)
    {
        /****** MAKE AN INT ARRAY WITH 10 ITEMS ******/
        
        // 1. Declare an int array with 10 default values
        int[] intArr = new int[10];
        // 2. Insert values (any) into the array at indices 0 to 8
        // Think: how can you insert the values without writting 9 lines of code
        for (int i = 0;i<9;i++){
            intArr[i] = i;
        }
        // 3. Set the value 1000 at index 2. Set the value -20 at index 3
        intArr[2] = 1000;
        intArr[3] = -20;
        // 4. Get the value at index 2 and print it out
        System.out.println(intArr[2]);
        // 5. Get the value at index 9 and print it out.
        // What is that value? Why?
        System.out.println(intArr[9]);
        // The value is 0 because it is the default value; we haven't changed it yet.
        // 6. What does it happen when you execute the next line?
        // System.out.println(intArr[10]);
        // It prints out an exception because there is no item at index 10.
        /****** MAKE A DOUBLE ARRAY WITH 10 ITEMS ******/
        // 1. Declare a double array with 10 default values
        double doubleArr[] = new double[10];
        // 2.Set any values at indices 0 and 9
        doubleArr[0] = 33.44;
        doubleArr[9] = 16;
        // 3. Get the value at index 0 and print it out. What is the value? Why?
        System.out.println(doubleArr[0]);
        // It is the value we set earlier because we changed it from a default value to our own value.
        /******* MAKE A STRING ARRAY WITH 10 SLOTS  ******/
        // 1. Make an array with 10 initial value
        String strArr[] = {"Ver","Lec","Ric","Nor","Pia","Alo","Sai","Ham","Rus","Gas"};
        // 2. Get and pring all the elements in your string array without writting 10 lines of code
        for (int i = 0;i<10;i++){
            System.out.println(strArr[i]);
        }
        /******* MAKE A BOOLEAN ARRAY WITH 10 SLOTS  ******/
        // 1. Make a default boolean array with 10 values 
        boolean boolArr[] = new boolean[10];
        // 2. Set the any values at indices 5 and 0
        boolArr[5] = true;
        boolArr[0] = true;
        // 3. Get the values at indices 2, 9, 5 and 0 and print them out
        int[] pos = {2,9,5,0};
        for (int i = 0;i<pos.length;i++){
            System.out.println(boolArr[pos[i]]);
        }
    
    }
}