// Java file: JavaBooksHandler.java

public class JavaBooksHandler {

    public void handleBooks() {
        // Using Kotlin list in Java
        List<Book> books = BooksKt.getKotlinBooks();

        // We can use list normally in Java
        System.out.println("First book: " + books.get(0));

        // Trying to modify the list will cause error
        books.add(new Book("Refactoring", "Martin Fowler", 1999)); // UnsupportedOperationException

    }

}