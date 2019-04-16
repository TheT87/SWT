

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
        while (test.next!=null){
            test = test.next;
        }
        test.next = new_ListElement;
        i++;
        return ;

    }

    //public boolean search(ListElement head,String string) { }


    public String remove(String string) {
            ListElement temp = head, prev = null;

            if (temp != null && temp.content.contentEquals(string) ) {
                head = temp.next;
                System.out.println(string + " entfernt");

                return string;
            }

            while (temp != null && !temp.content.contentEquals(string)) {
                prev = temp;
                temp = temp.next;

                //System.out.println(string + " entfernt");
            }

            // If key was not present in linked list
            if (temp == null) {
                //System.out.println("Element nicht in der Liste");
                return null;
            }
        prev.next = temp.next;
        return string;
    }


    public void printList()
    {
        ListElement element = head;
        if (element == null)
            System.out.println("Liste leer!");
        while (element != null)
        {
            System.out.println("Element: " + element.content + " ");
            element = element.next;
        }
    }
}
