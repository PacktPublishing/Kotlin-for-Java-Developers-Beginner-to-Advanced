public class JavaBookRepository {

    public List<Book> getJavaBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Clean Code", "Robert Martin", 2008));
        books.add(new Book("Design Patterns", "Gang of Four", 1994)); return books;

    }



}