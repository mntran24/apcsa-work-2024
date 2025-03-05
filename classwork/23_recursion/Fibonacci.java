public class Fibonacci {
    public static int fib(int n){
        if (n==0){
            return 0;
        }
        else{
            if(n==1){
                return 1;
            }
            else{
                return fib(n-2) + fib(n-1);
            }
        }
    }
    public static void main(String[] args) {
        //time 0.340s
        // System.out.println(fib(6));
        System.out.println(fib(50));
    }
}
