package linkedlist;

public class DoubleLl {
    private Node head;
    private Node tail;
    private int size;
    public DoubleLl(){
      this.size=0;
    }

    public void insertfirst(int val){
        Node node=new Node(val);
        node.next=head;
      node.prev=null;
      if(head!=null){
            head.prev=node;
      }
        head=node;
    }
    public void display(){
        Node temp=head;
        Node last=null;

        while(temp!=null){
            System.out.print(temp.value+"->");
            last=temp;
            temp=temp.next;


        }
        System.out.println("end");

        System.out.println("revesed");
        while(last!=null){
            System.out.print(last.value+"->");
            last=last.prev;
        }
        System.out.println("end");



    }
    public void insertlast(int val){

        Node node=new Node(val);
        Node last=head;
        if(head==null){
            node.prev=null;

            head=node;
        }
        while(last.next!=null){
            last=last.next;

        }
        last.next=node;
        node.next=null;
        node.prev=last;


    }




   private class Node {
       int value;
     private  Node next;
     private  Node prev;

     public Node(int value){
         this.value=value;
     }
     public Node(int value,Node next,Node prev){
         this.value=value;
         this.next=next;
         this.prev=prev;
     }

   }
}
