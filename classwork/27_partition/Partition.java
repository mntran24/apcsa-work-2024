public class Partition {
    public static int partition(int[] data, int start,int end) {
        print(data);
        // int piv = (int)(Math.random()*data.length);
        // System.out.println("piv "+piv);
        int piv = 2;
        int temp = data[piv];
        data[piv] = data[start];
        data[start] = temp;
        int left = start+1;
        int right = end;
        while(left<=right){
            print(data);
            if(data[right]>data[start]){
                right--;
            }
            else{
                if(data[left]>data[start]&&data[right]<data[start]){
                    System.out.println("switch left right");
                    System.out.println("left is num "+data[left]+" at index"+left);
                    System.out.println("right is num "+data[right]+" at index"+right);
                    int hold = data[left];
                    data[left] = data[right];
                    data[right] = hold;
                    print(data);
                }
                if(data[left]<data[start]){
                    left++;
                }
            }            
            print(data);
            // System.out.println("left is num "+data[left]+" at index"+left);
            System.out.println("right is num "+data[right]+" at index"+right);
        }
        // System.out.println("left is num "+data[left]+" at index"+left);
        System.out.println("right is num "+data[right]+" at index"+right);
        // if(data[left]<=data[start]){
            int a = data[right];
            data[right] = data[start];
            data[start] = a;
            System.out.println("last switch");
            // print(data);
        // }
        print(data);
        return right;
    }
    public static void print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        // int[] arr = {0,1,3,2,7,4};
        // System.out.println(partition(arr, 0,arr.length-1));
        int[] myarr = {0, 2, 98, 1, 2};
        System.out.println(partition(myarr, 0,myarr.length-1));
    }
}
