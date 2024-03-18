package LinkedList;
public class Main {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.display();
        list.insertLast(20);
        list.insertLast(17);
        list.insertLast(15);
        list.insertIndex(69,4);
        list.display();
        System.out.println(list.find(17));
        DLL dlist=new DLL();
        dlist.insertFirst(10);
        dlist.insertFirst(20);
        dlist.insertFirst(30);
        dlist.display();
        dlist.insertLast(70);
        dlist.insertLast(80);
        dlist.insertLast(90);
        dlist.display();
        dlist.displayRev();
    }
}
