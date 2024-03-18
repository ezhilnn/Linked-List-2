package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }
//    public void insertLast(int val) {
//        Node node = new Node(val);
//        tail.next = node;
//        tail = node;
//        if (head == null) {
//            head=tail;
//        }
//        size += 1;
//    }
public void insertLast(int val) {
    if (tail == null) {
        insertFirst(val);
        return;
    }
    Node node = new Node(val);
    tail.next = node;
    tail = node;
    size++;
}
//    public void insertIndex(int val,int index) {
//        Node node = new Node(val);
//        if(head==null){
//            node.next = head;
//            head = node;
//        }else{
//            Node temp=head;
//            while(index>0){
//                temp=temp.next;
//                index--;
//            }
//            node.next=temp.next;
//            temp.next=node;
//        }
//        if (tail == null) {
//            tail=head;
//        }
//        size += 1;
//    }
public void insertIndex(int val, int index) {
    if (index == 0) {
        insertFirst(val);
        return;
    }
    if (index == size) {
        insertLast(val);
        return;
    }

    Node temp = head;
    for (int i = 1; i < index; i++) {
        temp = temp.next;
    }

    Node node = new Node(val, temp.next);
    temp.next = node;

    size++;
}
    public int deleteFirst() {
        int val = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.val;

        prev.next = prev.next.next;
        size--;
        return val;
    }
    public int find(int val){
        Node curr=head;
        int index=0;
        while(curr!=null){

            if(curr.val==val){
                return index;
            }
            index++;
            curr=curr.next;
        }
        return -1;
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    private static class Node {
        private int val;
        private Node next;

        public Node(int data) {
            this.val = data;
        }

        public Node(int data, Node next) {
            this.val = data;
            this.next = next;
        }
    }
}
