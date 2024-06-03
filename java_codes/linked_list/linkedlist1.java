public class linkedlist1 {
   private  Node head ;
   private Node tail;
   private int size;

   public int deletefirst(){

       int value = head.value;
       head = head.next;
       size -=1;
       return value;
   }

   public void insert(int val , int index){
       if(index == 0){
           insertf(val);
           return;
       }
       if(index == size){
           inserLast(val);
           return;
       }
       Node node = new Node(val);
       Node temp = head ;
       int i = 1;
       while(i !=index){
           temp = temp.next;
           i++;

       }
       node.next = temp.next;
       temp.next = node ;
       size +=1;
   }

    public void inserLast(int val){
        if(tail == null){
            insertf(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node ;


    }
    public void insertf(int value){
        Node node = new Node(value);
        node.next = head ;
        if(tail ==null){
            tail = head;
        }
        head = node ;
        size ++;
    }

    public void display(){
        Node temp = head ;
        while(temp!= null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("end");
    }
    public class Node{
        public int value ;
         public Node next ;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        linkedlist1 l = new linkedlist1();
        l.insertf(3);
        l.insertf(4);
        l.insertf(5);
        l.insertf(6);
        l.insertf(7);

        l.display();
//        System.out.println();
//        l.inserLast(8);
//        l.inserLast(11);
//        l.inserLast(0);
//        l.display();
//        System.out.println();
//        l.insert(15,3);
        l.deletefirst();

        l.display();
    }
}
