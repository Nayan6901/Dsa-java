package linkedlist;

public class myll {
    private Node head;
    private Node tail;
    private int size;

    public myll(){
        this.size=0;
    }

    public void addfirst(int value){
        Node node =new Node( value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;

    }
    public void addlast(int value){
      if(tail==null){
          addfirst(value);
          return;

      }

       Node node=new Node(value);

       tail.next=node;
        tail=node;
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;


        }
        System.out.println("end");

    }
    public  Node find(int value){
        Node temp=head;

        while(temp!=null){
            if(temp.value==value){
                return temp;
            }
            temp=temp.next;
        }
        return null;

    }

    public int deleatefirst(){
        int value=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return value;

    }
    public int deletelast(){
        if(size<=1){
          return deleatefirst();
        }
        Node secondlast=get(size-2);
        tail=secondlast;
        int val=tail.next.value;
        tail.next=null;
        size--;
        return val;

    }
    private Node get(int index){
        Node node =head;
        for (int i = 0; i <index; i++) {

            node=node.next;

        }
        return node;
    }
    public void insert(int value,int index){
        if(index==0){
            addfirst(value);
            return;
        }if(index==size){
            addlast(value);
            return;

        }
        Node temp=head;
        for (int i = 1; i <index ; i++) {
         temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size++;
    }



 private class Node{
    private int value;
    private Node next;

    public Node(int value ){
        this.value=value;
    }
    public Node (int value,Node next){
        this.value=value;
        this.next=next;
    }

    }
}
