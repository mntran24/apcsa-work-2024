public class Merge {
    public static int[] merge(int[] left,int[] right){
        int[] ret = new int[left.length+right.length];
        merge(ret,left,right);
        return ret;
    }
    public static void merge(int[] destination, int[] left, int[] right){
        int l_index = 0;
        int r_index = 0;
        for(int i = 0;i<destination.length;i++){
            if(l_index<left.length){
                if(r_index<right.length){
                    if(left[l_index]<right[r_index]){
                        destination[i] = left[l_index];
                        l_index++;
                    }
                    else{
                        destination[i] = right[r_index];
                        r_index++;
                    }
                }
                else{
                    destination[i] = left[l_index];
                    l_index++;
                }   
            }
            else{
                destination[i] = right[r_index];
                r_index++;
            }
        }
    }
    public static int[] mergeSort(int[] data){
        if(data.length>1){
            int half = data.length/2;
            int[] l = new int[half];
            System.arraycopy(data, 0, l, 0, half);
            int[] r = new int[data.length-half];
            System.arraycopy(data, half, r, 0, data.length-half);
            return merge(mergeSort(l),mergeSort(r));
        }
        else{
            return data;
        }
    }
    public static void print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr1 = {4,8,-1, -8,9,7,25};
        int[] arr2 = {2,2,2,2};
        print(mergeSort(arr1));
    }
}
