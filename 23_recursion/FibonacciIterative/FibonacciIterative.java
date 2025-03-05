public class FibonacciIterative{
    public static int fibonacciIterative(int n, int f1, int f2){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return f2+fibonacciIterative(n-1, f1+f2, f1);
    }
    public static void main(String[] args){
        System.out.println(fibonacciIterative(7,1,0));
    }
}