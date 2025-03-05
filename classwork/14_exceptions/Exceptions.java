public class Exceptions {
    public static void main(String[] args){
        try{
            SuperArray arr = new SuperArray(-3);
        }
        catch(Exception e){
            System.out.println("Sth went wrong when creating the superarray.");
        }
        

    }
}
