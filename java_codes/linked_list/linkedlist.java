import org.w3c.dom.Node;

import java.util.LinkedList;

public class linkedlist  {
    private  Node head ;
    private Node tail;
    private int size ;
public void insertrecursion(int val , int index ){
    head = insertrec(val , index, head);
}
private Node insertrec(int val ,int index , Node node ){
    if(index == 0){
        Node temp = new Node(val ,node);
        size ++;
        return temp;
    }
    node.next = insertrec(val, index -1,node.next);
    return node;
}
    public Node find(int val){
        Node node = head;
        while(node != null){
            if(node.value == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }


    public linkedlist() {

        this.size = 0;
    }
    public int Delete( int index ){
        if(index == 0 ){
            return DeleteFirst();
        }
        if(index == size -1){
            return DeleteLast();
        }
        Node prev = get(index);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public int DeleteLast(){
        if(tail==head){
           return DeleteFirst();
        }
        int val = tail.value;
        Node secondlast = get(size -1);
        tail = secondlast;
        tail.next = null;
        size--;
        return val;

    }
    public Node get( int index){
        Node node = head ;
        for (int i = 1; i <index ; i++) {
            node = node.next;

        }
        return node;
    }
    public int DeleteFirst(){
        int val = head.value;
        head = head.next ;
        if(head== null){
            tail= null;
        }
        size--;
        return val;
    }
    public  void insert(int val , int index ){
        if(index == 0){
            insertFast(val);
            return;
        }
        if(index == size){
            inserLast(val);
            return ;
        }
        Node temp = head;
        for (int i = 1; i <index ; i++) {
            temp = temp.next;

        }
        Node node = new Node(val,temp.next);
        temp.next = node ;
        size++;
    }

    public void inserLast(int val){
        if(tail == null){
            insertFast(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node ;


    }
    public void insertFast(int val){
        Node node = new Node(val);
        node.next = head ;
        head = node ;

         if (tail == null){
             tail = head;

         }
         size += 1;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ->");
            temp = temp.next;
        }
        System.out.print("End");
    }

    public class Node {
    public int value;
      public Node next;

    public Node (int value) {
        this.value = value;
    }

    public Node (int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
   public void duplicates(){
    Node node = head ;
    while(node.next != null){
        if(node.value == node.next.value){
            node.next = node.next.next;
            size--;
        }
        else {
            node = node.next ;
        }

    }
   }
   public static linkedlist merge(linkedlist first , linkedlist second){
    Node f = first.head;
    Node s = second.head ;

    linkedlist ans = new linkedlist();
    while (f!=null && s!= null){
        if(f.value < s.value){
            ans.inserLast(f.value);
            f = f.next;
        }
        else{
            ans.inserLast(s.value);
            s = s.next;
        }
    }
    while(f!= null){
        ans.inserLast(f.value);
        f = f.next;
    }
    while(s!=null){
        ans.inserLast(s.value);
        s = s.next;
    }
    return ans;
   }
   public   boolean cycle(){
    Node fast = head;
    Node slow = head ;
    while(fast.next != null && fast !=null){
        fast = fast.next.next ;
        slow = slow.next;
        if(fast == slow){
            return true;
        }
    }
    return false;
   }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();

        l.insertFast(1);
        l.insertFast(1);
        l.insertFast(2);
        l.insertFast(2);
//        l.insertFast(3);
        l.insertrecursion(6,3);
        l.insertrecursion(7,4);
//        l.insertFast(3);
        l.display();
//        System.out.println();
//        l.duplicates();
//        l.display();
//        linkedlist first = new linkedlist();
//        linkedlist second = new linkedlist();
//        first.inserLast(1);
//        first.inserLast(4);
//        first.inserLast(5);
//        first.display();

//       second.inserLast(2);
//        second.inserLast(13);
//        second.inserLast(114);
//
//        linkedlist ans = linkedlist.merge(first, second);
//        ans.display();

    }
}