public class SnapShot{
    public static void main(String[] args){
        String[] welcome = {"Welcome","to","the snap shot","app!"};
        for (String item:welcome){
            System.out.println(item);
        }
        welcome[0]="Upgrade";
        welcome[welcome.length-1]="premium app";
        for (String item:welcome){
            System.out.println(item);
        }
    }
}