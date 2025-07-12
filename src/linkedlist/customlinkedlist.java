package linkedlist;

public class customlinkedlist {

    public static void main(String[] args) {
        myll list =new myll();

        list.addlast(3);
        list.addlast(9);
        list.insert(5,1);
//        System.out.println(list.deletelast());
        System.out.println(list.find(9));

        list.display();


    }

}
