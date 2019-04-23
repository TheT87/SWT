
public class HelloLibrary {


    public static void main(String[] args) {


        Library lib = new Library();



        Book book1 = new Book("Harry Potter und ein Stein");
        Book book2 = new Book("Harry Potter und der Plastikpokal");


        lib.add(book1);
        lib.add(book2);

        //System.out.println(library);


    }
}