package LinkedList;

import org.w3c.dom.Node;

public class DLL {
    Node1 head;

    public void insertFirst(int val) {
        Node1 node = new Node1(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }
    public void insertLast(int val){
        Node1 node=new Node1(val);
        if(head==null){
            head=node;
            return;
        }
        Node1 curr = head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=node;
        node.prev=curr;
    }
    public void insert(int after, int val) {
        Node1 p = find(after);

        if (p == null) {
            System.out.println("does not exist");
            return;
        }

        Node1 node = new Node1(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }
    public Node1 find(int value) {
        Node1 node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node1 curr = head;
        while (curr != null) {
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        System.out.println();
    }
    public void displayRev(){
        Node1 last=getLast();
        while(last!=null){
            System.out.print(last.val+"->");
            last=last.prev;
        }
        System.out.println();
    }
    public Node1 getLast(){
        Node1 curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        return curr;
    }

    public class Node1 {
        int val;
        Node1 next;
        Node1 prev;

        public Node1(int val) {
            this.val = val;
        }

        public Node1(int val, Node1 next, Node1 prev) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }
}
