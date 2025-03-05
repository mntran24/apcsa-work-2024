public class Quick {
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
    public static int quickSelect(int[] data, int k, int start, int end){
        int pivot = partition(data, start, end);
        if(pivot>k-1){
            return quickSelect(data, k, start, pivot-1);
        }
        else if(pivot<k-1){
            return quickSelect(data, k, pivot+1, end);
        }
        else{
            return data[pivot];
        }
    }
    public static void print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {123, 234, 98, 1, 2, 10, 5, 100, 2, 20};
        System.out.println(quickSelect(arr, 6, 0, arr.length-1));
        // System.out.println(partition(arr, 0, arr.length-1));
    }
}
