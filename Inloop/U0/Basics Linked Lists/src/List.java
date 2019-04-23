

public class List {
    ListElement head;
    int i = 0;
    public void append(String string){
        ListElement new_ListElement = new ListElement(string);
        if(head == null){
            head = new ListElement(string);
            return;
        }
        new_ListElement.setNext(null);
        ListElement test = head;
        while (test.getNext()!=null){
            test = test.getNext();
        }
        test.setNext(new_ListElement);
        i++;
        return ;

    }

    //public boolean search(ListElement head,String string) { }


    public String remove(String string) {
            ListElement temp = head, prev = null;

            if (temp != null && temp.getContent().equals(string) ) {
                head = temp.getNext();
                return string;
            }

            while (temp != null && !temp.getContent().equals(string)) {
                prev = temp;
                temp = temp.getNext();


            }


            if (temp == null) {
                System.out.println(string + " nicht in der Liste");
                return null;
            }
        prev.setNext(temp.getNext());
        System.out.println(string + " entfernt");
        return string;
    }


    public void printList()
    {
        ListElement element = head;
        if (element == null)
            System.out.println("Liste leer!");
        while (element != null)
        {
            System.out.println("Element: " + element.getContent()+ " ");
            element = element.getNext();
        }
    }
}
