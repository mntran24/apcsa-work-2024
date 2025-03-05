public class Novel extends Book {
    private int readingLevel;
    private String genre;
    public Novel(String title, String author, 
            int readingLevel, String genre){
        super(title, author);
        this.readingLevel = readingLevel;
        this.genre = genre;
    }
    @Override
    public String toString(){
        return genre + " Novel";
    }
}
