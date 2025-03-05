public class Book {
    private String title,author;
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public String toString(){
        return "Book: "+title;
    }
}
