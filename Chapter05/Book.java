public class Book {
    private String title;
    private String author;
    private String isbn;
    private int pages;

    public Book(String title, String author, String isbn,int pages) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages= pages;
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

}


/* Book class with GETTERS and SETTERS, example just with 1 property
public class Book {
    private String title;
    private String author;
    private String isbn;
    private int pages;

    public Book(String title, String author, String isbn, int pages) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
    }

    // Getter
    public String getTitle() {
        return this.title;
    }

    // Setter
    public void setTitle(String title) {
        this.title = title;
    }
}
 */