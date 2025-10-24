public class ReverseLL {
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
    public static int size;

    public void addFirsttoLL(int data){
       Node newNode=new Node(data);
       size++;
       if(Head ==null){
          Head=Tail=newNode;
       }
     newNode.next=Head;
     Head=newNode;
     
    }
     public void addFirst(int data){
        // create a node
         Node newNode=new Node(data);
         size++;
             if(Head ==null){
                 Head=Tail=newNode;
             }
         //assign next of newNode as Head
         newNode.next=Head;

         //assign Head as the newNode
         Head=newNode;

      }
     
    public void Print(Node Head){
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
    }

     public void printLL( Node Head){
        Node temp=Head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
      }


public static void main(String[] args){
     ReverseLL ll=new ReverseLL();
     ll.addFirst(1);
     ll.addFirst(2);
     ll.addFirst(3);
     ll.Print(Head);
}
}
