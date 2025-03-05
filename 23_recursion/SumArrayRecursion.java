public class SumArrayRecursion {
    public static int sumArrayRecursion(int[] nums, int index){
        int sum = 0;
        if(index==nums.length){
            return sum;
        }
        else{
            sum += nums[index];
            return sum + sumArrayRecursion(nums, index+1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sumArrayRecursion(arr, 0));
    }
}
