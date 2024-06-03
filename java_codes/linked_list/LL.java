public class LL {
    private Node head;
    private Node tail;
    private int size ;
    public Node find(int val){
        Node node = head ;
        while(node != null){
            if(node.value == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public int delete(int index){
        if(index ==0){
            return deletefirst();
        }
        if(index == size){
            return deletelast();
        }
        Node sec = get(index);
        int value = sec.next.value;
        sec.next = sec.next.next;
        size --;
        return value;

    }
    public int deletelast(){
        if(tail == head){
            return deletefirst();

        }
        int value = tail.value;
        Node secondlast = get(size -1);
//        secondlast.value = tail.value;
        secondlast.next = null;
        tail = secondlast;
        size --;
        return value;


    }
    public int deletefirst(){
        int value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }
    public void insert(int val , int index){
        Node node = new Node(val);
        if(index == 0){
            insertfirst(val);
            return;
        }
        if(index == size){
            insertlast(val);
            return;
        }
        Node temp = get(index);
        node.next = temp.next;
        temp.next = node ;
        size++;

    }
    public Node get(int index){
        Node temp = head ;
        for (int i = 1; i <index ; i++) {
            temp = temp.next;

        }
        return temp;
    }
    public void insertlast(int val){
        Node node = new Node(val);
        node = tail.next;
        tail = node ;
        if(tail ==null){
            insertfirst(val);
        }
        size +=1;
    }
    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node  ;
        if(tail == null){
            tail = head;
        }
        size += 1;

    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("end ");

    }

    public class   Node {
        private  int value ;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


}
