import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Collections;


public class Library {
    private List<Book> stock;

    public Library() {
        stock = new ArrayList<Book>();
    }

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

    public Book searchForISBN(String isbn) {
        int index = Collections.binarySearch(stock, new Book(isbn));
        if (index < 0)
            return null;
        return stock.get(index);
    }

    public Collection<Book> searchForAutor(String author) {
        Collection<Book> result = new ArrayList<Book>();
        for (Book b : stock) {
            if (b.getAuthor().equals(author)) {
                result.add(b);
            }
        }
        return result;

    }




}











}
