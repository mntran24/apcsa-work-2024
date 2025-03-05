public class TextBook extends Book {
    private int edition;
    private boolean isEbook;
    public TextBook(String title, String author, 
                int edition, boolean isEbook){
        super(title, author);
        this.edition = edition;
        this.isEbook = isEbook;
    }
    public boolean isEbook(){
        return isEbook;
    }
    @Override
    public String toString(){
        return "Textbook edition # " + edition;
    }
}
