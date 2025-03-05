import java.util.Arrays;
import java.util.Random;

public class Sorts {
    public static void main(int[] args) {
        // int[] arr = new int[] { 8, 4, 6, 9, 10, 5, 1, 4, 2 };
        // int[] arrb = new int[arr.length];
        // for (int a = 0; a < arr.length; a++) {
        //     arrb[a] = arr[a];
        // }
        // BubbleSort(arr);
        // SelectionSort(arr);
        // InsertionSort(arr);
        // Arrays.sort(arrb);
        int key = 1;
        int temp = 0;
        for (int i = 0; i < args.length - 1; i++) {
            int count = key;
            for (int x = key - 1; x >= 0; x--) {
                if (args[x] > args[count]) {
                    temp = args[x];
                    args[x] = args[count];
                    args[count] = temp;
                }
                count--;
            }
            key++;
        }
        }
        for (int j = 0;j<args.length;j++){
            System.out.println(args[j]);
        }
        // toString(arr);
        // toString(arrb);
        // // System.out.println();
        // Random rd = new Random();
        // int[] ls = new int[(int) (Math.random() * 10)];
        // for (int m = 0; m < ls.length; m++) {
        //     ls[m] = rd.nextInt();
        // }
        // int[] lsb = new int[ls.length];
        // for (int l = 0; l < ls.length; l++) {
        //     lsb[l] = ls[l];
        // }
        // BubbleSort(ls);
        // SelectionSort(ls);
        // InsertionSort(ls);
        // Arrays.sort(lsb);
        // toString(ls);
        // toString(lsb);
    }

    public static void BubbleSort(int[] data) {
        int num = data.length;
        for (int i = 0; i < data.length - 1; i++) {
            for (int x = 0; x < num - 1; x++) {
                if (data[x] > data[x + 1]) {
                    int temp = data[x];
                    data[x] = data[x + 1];
                    data[x + 1] = temp;
                }
            }
            num--;
        }
        // Time complexity for worst case is O(n^2).
    }

    public static void SelectionSort(int[] data) {
        int num = 0;
        int min = data[num];
        int temp = 0;
        int index = 0;
        for (int i = 0; i < data.length - 1; i++) {
            for (int x = num + 1; x < data.length; x++) {
                if (data[x] < min) {
                    min = data[x];
                    index = x;
                }
            }
            if (min != data[num]) {
                temp = data[num];
                data[num] = min;
                data[index] = temp;
            }
            num++;
            min = data[num];
        }
    }

    public static void toString(int[] data) {
        for (int o = 0; o < data.length; o++) {
            System.out.print(data[o] + " ");
        }
        System.out.println();
    }

    // public static void InsertionSort(int[] data) {
    //     int key = 1;
    //     int temp = 0;
    //     for (int i = 0; i < data.length - 1; i++) {
    //         int count = key;
    //         for (int x = key - 1; x >= 0; x--) {
    //             if (data[x] > data[count]) {
    //                 temp = data[x];
    //                 data[x] = data[count];
    //                 data[count] = temp;
    //             }
    //             count--;
    //         }
    //         key++;
    //     }
    // }
}
