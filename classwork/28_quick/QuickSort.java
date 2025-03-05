public class QuickSort{
    public static void quickSort(int[] data, int start, int end){
        if (start < end) {
            int pivot = partition(data, start, end);
            quickSort(data, start, pivot - 1);
            quickSort(data, pivot + 1, end);
        }
    }
    public static int partition(int[] data, int start,int end) {
        print(data);
        int piv = (int)(Math.random()*(end-start))+start;
        System.out.println("piv "+piv);
        // int piv = 3;
        int temp = data[piv];
        data[piv] = data[start];
        data[start] = temp;
        int left = start+1;
        int right = end;
        while(left<=right){
            System.out.println("left is num "+data[left]+" at index"+left);
            System.out.println("right is num "+data[right]+" at index"+right);
            if(data[right]>=data[start]){
                right--;
            }
            else{
                if(data[left]>data[start]&&data[right]<data[start]){
                    int hold = data[left];
                    data[left] = data[right];
                    data[right] = hold;
                }
                if(data[left]<=data[start]){
                    left++;
                }
            }
            print(data);
            // System.out.println("left is num "+data[left]+" at index"+left);
            // System.out.println("right is num "+data[right]+" at index"+right);
        }
        // System.out.println("left is num "+data[left]+" at index"+left);
        // System.out.println("right is num "+data[right]+" at index"+right);
        int a = data[right];
        data[right] = data[start];
        data[start] = a;
        print(data);
        return right;
    }
    public static void print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {123, 234, 98, 1, 2, 10, 5, 100, 2, 20};
        quickSort(arr, 0, arr.length-1);
        print(arr);
    }
}