import java.util.ArrayList;
public class Driver {
    public static void main(String[] args){
        ArrayList<Book> libby = new ArrayList<Book>();
        Book nov1 = new Novel("A Game of Thrones","George R. R. Martin",10,"Fantasy");
        Book nov2 = new Novel("1984","George Orwell",10,"Dystopian");
        Book text1 = new TextBook("IGCSE Mathematics","Ric Pimentel",2,true);
        Book text2 = new TextBook("American History","Alan Brinkley",5,false);
        libby.add(nov1);
        libby.add(nov2);
        libby.add(text1);
        libby.add(text2);
        for (int i = 0;i<libby.size();i++){
            System.out.println(libby.get(i).toString());
        }
    }
}
