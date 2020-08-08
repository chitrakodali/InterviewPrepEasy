public class LLAtSpecifiedPosition {
    Node head;
    Node tail;
    static class Node{

        int data;
        Node next;
        Node(int d){
            data =d;
            next =null;
        }
    }
    public void printList(){

        Node n = head;
        while (n!= null) {
            System.out.println("Data: " + n.data);
            n = n.next;
        }

    }
    public void createNote(int d){
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
    }
    public
   void insertNthNode(Node head, int data, int pos){

           Node newNode = new Node(data);
          // newNode.data = data;

           if(head == null)
               head= newNode;
           else if(pos == 0) {
               newNode.next = head;
               head = newNode;
           }

           Node currNode = head;

           for(int i=0; i<pos-1; i++) {
               currNode = currNode.next;
           }

           newNode.next = currNode.next;
           currNode.next = newNode;

       }
     void insertAtFirst(int data){

        Node newNode = new Node(data);
       /* if (head == null){
            head = newNode;
        } */
        newNode.next = head;
        head = newNode;
     }

     void create(int data){
        Node n = new Node(data);
        if (head == null)
            head = n;
        tail = head;
        while(tail.next != null){
            tail = tail.next;
            tail.next = n;
        }

     }
    public static void main(String[] args){
       LLAtSpecifiedPosition ll = new LLAtSpecifiedPosition();
      /* ll.createNote(16);
       ll.createNote(13);
       ll.createNote(7);
       ll.printList();
       ll.insertAtFirst(2);
       ll.printList();
       ll.insertNthNode(ll.head,1,1);
       ll.printList();
 */
      ll.insertAtFirst(2);
    //  ll.insertAtFirst(3);
      ll.printList();
    }
}
