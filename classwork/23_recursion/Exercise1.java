public class Exercise1 {
    public static boolean isEven(int n){
        if(n<=0){
            return n==0;
        }
        else{
            return isEven(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(isEven(5));
    }
}
