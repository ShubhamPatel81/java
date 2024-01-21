//import Node.Node;

public class singly_linked_list {
    private Node head;
    private Node tail;
    private int size;
    public singly_linked_list(){
        this.size= 0;
    }

// Inserting the value into the LinkedList
    public void  insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
         head= node;
         if(tail == null){
             tail = head;
         }
         size +=1;
    }
    // Displaying the LinkedList
    public void display(){
        Node temp = head;
        if(temp == null){

        }
       while (temp!=null){
           System.out.print(temp.value +" ->");
           temp= temp.next;
       }
        System.out.print("END");
    }

    // Inserting value
    public  void insert(int value){
        if(tail == null){
            insertFirst(value);
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    // Insertiong at a particular Index
    public void insert_index(int value , int index){
        if(index ==0){
            insertFirst(value);
            return;
        }
        if(index== size){
            insert_last(value);
            return;
        }
        Node temp = head;
        for(int i =1; i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }
    //Creating the constructor of the input values
    private class Node{
        private int value;
        private  Node next;

        public Node(int value){
            this.value = value;

        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
   singly_linked_list sl = new singly_linked_list();
   sl.insertFirst(2);
   sl.insertFirst(3);
   sl.insertFirst(4);
   sl.insertFirst(5);
   sl.insertFirst(26);
   sl.insertFirst(7);
   sl.insertFirst(9);
   sl.insert(1221);
   sl.insert_index(12121212, 3);
   sl.display();

    }
}
