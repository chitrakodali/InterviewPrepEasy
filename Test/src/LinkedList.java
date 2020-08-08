public class LinkedList {
  Node head;
  Node last;
  Node prev;
  static class Node {
      int data;
      Node next;
      Node(int d) {
          data = d;
          next = null;
      }
  }

    void printList(){
      Node n = head;
      while (n!= null){
          System.out.println("Data: " + n.data);
          n = n.next;
      }
   }
   void printNthElem(int n){
      //Node n = head;


   }
   void insertAtFirst(int newData) {
       Node newNode = new Node(newData);
       newNode.next = head;
       head = newNode;
       if (last == null){
           last = newNode;
       }
   }
   void insertAtEnd(int newData){
      //Node
       Node newNode = new Node(newData);
       if (head == null){
               head = new Node(newData);
           return;
       }
       newNode.next = null;
       last = head;
       while (last.next != null){
           last = last.next;
       }
       //prev = head;
       last.next = newNode;
       return;
   }

   void insertAfterPrev(Node prevNode,int newData){
      if (prevNode == null) {
          System.out.println("Node cannot be null");
          return;

      }
          Node newNode = new Node(newData);
          newNode.next = prevNode.next;
          prevNode.next = newNode;

   }

    void insertBeforeLast(Node lastNode,int newData){
        if (lastNode == null && head == null) {

                System.out.println("Node cannot be null");

            return;

        }
        Node newNode = new Node(newData);
        newNode.next = last.next;
        lastNode.next = newNode;

    }
    void insertBeforePrev(int newData){
      if (head == null){
          System.out.println("Node cannot be null");

          return;
      }
      System.out.println("I am here");
      Node prev = head;
      Node newNode = new Node(newData);

      while(prev.next.next != null){
          prev = prev.next;
          //head = head.next;

      }
      newNode.next = prev.next;
      prev.next = newNode;
    }
    void deleteLastNode(){

    }
    public static void main (String[] args){

      LinkedList lLink = new LinkedList();
       // lLink.insertAtEnd(6);
       lLink.insertAtFirst(16);
       lLink.insertAtFirst(13);
       lLink.insertAtFirst(7);
   //    lLink.insertAtFirst(2);
     //  lLink.insertAtFirst(10);

     //  lLink.insertAtEnd(4);
      lLink.insertBeforePrev(1);
    // lLink.insertAfterPrev(lLink.last.next,45);

       lLink.printList();

    }
}
