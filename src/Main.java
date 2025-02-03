import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>(Arrays.asList(
                new Book("Eylem's Day", "Eylem Kurada", 123, "1/1/2025"),
                new Book("Ihsan's World", "Ihsan", 321, "2/2/2025"),
                new Book("The Great Gatsby", "F. Scott Fitzgerald",80,  "5/5/1914"),
                new Book("Moby-Dick", "Herman Melville",65,  "3/9/1851"),
                new Book("War and Peace", "Leo Tolstoy",25,  "15/8/1869"),
                new Book("The Catcher in the Rye", "J.D. Salinger", 27,  "23/2/1951"),
                new Book("The Hobbit", "J.R.R. Tolkien",30,  "28/11/1937"),
                new Book("Crime and Punishment", "Fyodor Dosto",43,  "2/1/1866"),
                new Book("The Odyssey", "Homer",51,  "19/12/1800"),
                new Book("Brave New World", "Aldous Huxley",11,  "21/6/1932")
        ));



        Map<String, String> bookNameAuthor = books.stream().collect(Collectors.toMap(Book::getName, Book::getAuthor));

        System.out.println("Kitap - Yazar Map:");
        bookNameAuthor.forEach((title, author) -> System.out.println(title + " - " + author));

        List<Book> booksOver100 = books.stream().filter(book -> book.getPageNum() > 100).collect(Collectors.toList());
        System.out.println();

        System.out.println("Books over 100 pages: ");

        booksOver100.stream().forEach(book -> System.out.println(book.getName() +" "
                + book.getPageNum()+" "+ book.getAuthor()+" "+ book.getPubDate()));

    }
}
