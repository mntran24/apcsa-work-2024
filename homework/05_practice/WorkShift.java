public class WorkShift{
    public static void main(String[] args){
        int hours = 20;
        int minutes = 42;
        int seconds = 16;
        seconds += minutes * 60 + hours * 60 * 60;
        System.out.println(seconds);
    }
}