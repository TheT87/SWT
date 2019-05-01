import java.util.*;


public class Library {
    private List<Book> stock = new ArrayList<Book>() ;

    public void setStock(List<Book> stock) {
        this.stock = stock;
    }

    public Collection<Book> getStock(){
        return stock;
    }

    public void sortedInsertion(Book neuesBuch) {
        stock.add(neuesBuch);
        Collections.sort(stock);
    }

    public Book searchForIsbn(String isbn) {
        Objects.requireNonNull(isbn);
        int index = Collections.binarySearch(stock, new Book(isbn));
        if (index < 0) {
            return null;
        }
        return stock.get(index);
    }

    public Collection<Book> searchForAuthor(String author) {
        Objects.requireNonNull(author);
        Collection<Book> result = new ArrayList<Book>();
        for (Book b : stock) {
            if (b.getAuthor().equals(author)) {
                result.add(b);
            }
        }
        return result;

    }




}
