import java.util.Scanner;

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
       public static int size;
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
      public void addLast(int data){
          // create a node
         Node newNode=new Node(data);
         size++;
             if(Head ==null){
                 Head=Tail=newNode;
             }
             //assign next of tail to newNode
             Tail.next=newNode;

             //assign tail as the newNode
             Tail=newNode;
      }
      public void addMiddle(int index,int data){
         
        
      }
      public int RemoveLast(){
        if(size==0){
            System.out.println("Linked List is empty");
            return 0;
        }else if(size==1){
            int val=Head.data;
            Head=Tail=null;
            size=0;
            return val;
        }
        Node prev=Head;
        for( int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        Tail=prev;
        size--;
        return val;
      }
      public void printLL( Node Head){
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+ " -> " );
            temp=temp.next;
        }
        System.out.print("null");
      }
      public int search(int key){
        Node temp=Head; int i=0;
        while(temp!=null){
            if(temp.data==key){
            return i;
            }
            else{
                temp=temp.next;i++;
            }
        }
        return -1;
      } 


      public int helper(Node Head,int key){
        if(Head==null){
            return -1;
        }
        if(Head.data==key){
            return 0;
        }     
        int idx=helper(Head.next, key);
        if(idx==-1){return -1;}
        return idx+1;
    }

      public int recSearch(int key){
        return helper(Head,key);
      }


      public void Reverse(){
        Node prev=null;
        Node curr=Tail=Head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Head=prev;
      }
 //important functio asked in many companies
    public void deleteNth(int n){

     }



    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     Basiclinkedlist ll=new Basiclinkedlist();
     ll.addFirst(1);
     ll.addFirst(2);
     ll.addLast(5);
     ll.addLast(3);
     ll.printLL(Head);
     System.out.println("\n"+"Size of Linked List: "+ size);
     System.out.println("Enter value to search: ");
     int key=sc.nextInt();
     int index=ll.recSearch(key);
     System.out.println("Key found at index node: "+ index);
     ll.Reverse();
     ll.printLL(Head);
    //  int deleted=ll.RemoveLast();
    //  System.out.println("node deleted="+deleted);
    //   ll.printLL(Head);
    }
}