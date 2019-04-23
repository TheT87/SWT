

public class Main {

    public static void main(String[] args) {

    List list = new List();
    String[] values = new String[] { "1", "2", "3", "4", "3", "5", "6" };
    for (int q = 0; q < values.length; q++) {
        list.append(values[q]);
    }


        list.printList();
        list.remove("3");

        System.out.println(" ");
        list.printList();


    }
}
