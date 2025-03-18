
class Sequences{

    public static void main(String[] args) {
        List<Book> books = getBooks();
        Stream<String> titleStream = books.stream()
                .filter(book -> book.getPages() > 300)
                .map(Book::getTitle)
                .limit(3);

        List<String> titles = titleStream.collect(Collectors.toList());

        //Kotlin code:
        /*
        val books = getBooks()
        val titles = books.asSequence()
            .filter { it.pages > 300 }
            .map { it.title }
            .take(3)
            .toList()
         */

        // Java - Create intermediate collections
        /*
        books.stream()

                .filter(predicate1) // Create intermediate Stream

                .filter(predicate2) // Create another Stream

                .collect(Collectors.toList());

         */

        // Kotlin - Process element by element
        /*
        books.asSequence()
            .filter { predicate1 } // Do not create intermediate collection
            .filter { predicate2 } // Do not create intermediate collection
            .toList()
        }

         */

        //Code Reuse Java
        /*
        Stream<Book> stream = books.stream().filter(predicate);
        stream.forEach(System.out::println);
        stream.forEach(System.out::println); // Throws exception
         */

        //Kotlin code
        /*
        val sequence = books.asSequence().filter { predicate }
        sequence.forEach { println(it) }
        sequence.forEach { println(it) } // Works correctly
         */

        //Terminal operations.
        //Java
        //long count = books.stream().count(); // Total number of books
        //Optional<Book> firstBook = books.stream().findFirst();
        //List<Book> bookList = books.stream().collect(Collectors.toList());

        //Kotlin
        //val count = books.asSequence().count() // Total number of books
        //val firstBook = books.asSequence().firstOrNull()
        //val bookList = books.asSequence().toList()


}