public class Basiclinkedlist{
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
      public static Node Head;
      public static Node Tail;
      
      public void addFirst(int data){
        // create a node
         Node newNode=new Node(data);
             if(Head ==null){
                 Head=Tail=newNode;
             }
         //assign next of newNode as Head
         newNode.next=Head;

         //assign Head as the newNode
         Head=newNode;

      }
      public void addLast(int data){
          // create a node
         Node newNode=new Node(data);
             if(Head ==null){
                 Head=Tail=newNode;
             }
             //assign next of tail to newNode
             Tail.next=newNode;

             //assign tail as the newNode
             Tail=newNode;
      }

      public void printLL( Node Head){
        Node temp=Head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
      }



    public static void main(String[] args){
     Basiclinkedlist ll=new Basiclinkedlist();
     ll.addFirst(1);
     ll.addFirst(2);
     ll.addLast(5);
     ll.addLast(3);
     ll.printLL(Head);
    }
}