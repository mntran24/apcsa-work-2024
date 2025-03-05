import java.util.ArrayList;

public class TowerHanoi {
    private static ArrayList<String> rodA,rodB,rodC = new ArrayList<String>();
    public static void hanoiMild(int n, char source_rod, char destination_rod, char aux_rod){
        if(n==1){
            System.out.println("Move ring 1 from source " + source_rod + " to destination " + destination_rod);
            return;
        }
        else{
            hanoiMild(n-1, source_rod, aux_rod, destination_rod);
            System.out.println("Move ring "+n+" from source "+source_rod+" to destination "+destination_rod);
            hanoiMild(n-1,aux_rod,destination_rod,source_rod);
        }
    }
    public static int hanoiMedium(int n, char source_rod, char destination_rod, char aux_rod){
        if(n==1){
            System.out.println("Move ring 1 from source " + source_rod + " to destination " + destination_rod);
            return 1;
        }
        else{
            hanoiMedium(n-1, source_rod, aux_rod, destination_rod);
            System.out.println("Move ring "+n+" from source "+source_rod+" to destination "+destination_rod);
            return (int)(Math.pow(2,n-1))+hanoiMedium(n-1,aux_rod,destination_rod,source_rod);
        }
    }
    // public static void hanoiSpicy(int n, char source_rod, char destination_rod, char aux_rod){
    //     if(n==1){
    //         System.out.println("Move ring 1 from source " + source_rod + " to destination " + destination_rod);
    //         rod1.remove("1");
    //         rod3.add("1");
    //         return;
    //     }
    //     else{
    //         hanoiSpicy(n-1, source_rod, aux_rod, destination_rod);
    //         System.out.println("Move ring "+n+" from source "+source_rod+" to destination "+destination_rod);
    //         hanoiSpicy(n-1,aux_rod,destination_rod,source_rod);
    //     }
    // }
    public static void main(String[] args) {
        // hanoiMild(4,'A','C','B');
        System.out.println("Total number of moves: "+hanoiMedium(4, 'A', 'C', 'B'));
    }
}
