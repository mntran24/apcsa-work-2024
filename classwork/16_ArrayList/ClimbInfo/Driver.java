import java.util.ArrayList;
public class Driver{
     public static void main(String[] args)
     {
         // YOUR CODE HERE
        //  ClimbInfo climb1 = new ClimbInfo("Fansipan", 300);
        //  ClimbInfo climb2 = new ClimbInfo("Fansipan", 209);
        //  ClimbInfo climb3 = new ClimbInfo("Andes", 330);
        //  ClimbInfo climb4 = new ClimbInfo("Kilimanjaro", 304);
         ClimbingClub club1 = new ClimbingClub();
         club1.addClimb("Fansipan", 300);
         club1.addClimb("Fansipan", 209);
         club1.addClimb("Andes", 330);
         club1.addClimb("Kilimanjaro", 304);
         club1.addClimb("Kilimanjaro", 333);
         club1.addClimb("Pyrenees", 314);
         for (int i = 0;i<club1.getSize();i++){
            System.out.println(club1.getItem(i).getName());
         }
         System.out.println(club1.distinctPeakNames());
     }
 }