public class DLL {
    private  int size ;
    private  Node head ;
    private Node tail;
    public void insertfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }
    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + "->");
            node = node.next;
            size++;
        }
        System.out.print("end");
        System.out.println("display in reverse");
             node = tail;
            while(tail!=null){
                System.out.print(node.value + "->");
                node = node.prev;
                size++;
            }
            System.out.print("start");
        }


    public void revdisplay(){
        Node node1 = tail;
        while(tail!=null){
            System.out.print(node1.value + "->");
            node1 = node1.prev;
            size++;
        }
        System.out.print("start");
    }


    public class Node{
        private  int value ;
        private Node next;
        private  Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value,Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
