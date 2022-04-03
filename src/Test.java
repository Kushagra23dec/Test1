import java.util.Scanner;

//Node Class
class Node{
    private int data;
    private Node next;

    public Node(){
        data=0;
        next=null;
    }

    public Node (int d,Node n){
        data=d;
        next=n;
    }

    public void setData(int d){
        data=d;
    }
    public void setNext(Node n){
        next=n;
    }

    public int getData(){
        return data;
    }

    public Node getNext(){
        return next;
    }

}


// LinkedList Class
class LinkedList{
    //LinkedList Class Member Variables
    private int size;
    private Node start;

    //Default Constructor for LinkedList
    public LinkedList(){
        size=0;
        start=null;
    }

    //Insert At First
    public void insertAtFirst(int val){
    Node n;
    n = new Node();
    n.setData(val);
    n.setNext(start);
    start = n;
    size++;
    }

    //Insert At Last
    public void insertAtLast(int val){
        Node n,t;
        n = new Node();
        n.setData(val);
        t = start;
        if(t==null)
            start=n;
        else {
            while (t.getNext() != null) {
                t = t.getNext();
            }
            t.setNext(n);
        }
            size++;

    }

    //Insert At Position
    public void insertAtPosition(int val, int pos){
        if(pos==1){
            insertAtFirst(val);
        }
        else if(pos==size+1){
            insertAtLast(val);
        }
        else if(pos>1&&pos<=size){
            Node n;
            n = new Node(val,null);
            Node t = start;
            for(int i = 1; i<pos-1; i++){
                t = t.getNext();
                n.setNext(t.getNext());
                t.setNext(n);

            }
            size++;
        }
        else{
            System.out.println("Insertion is not possible at this position: "+ pos);
        }
    }

    //Delete at Position
    public void deleteAtPosition(int pos){
        if(start==null){
            System.out.println("list is empty");
        }
        else if(pos<1 || pos>size) {
            System.out.println("Invalid Position");
        }
        else if(pos==1){
            deleteFirst();
        }
        else if(pos==size){
            deleteLast();
        }
        else if(pos>1 || pos < size){
            Node t,t1;
            t = start;
            for(int i = 1; i<pos-1; i++){
                t = t.getNext();
                t1 =t.getNext();
                t.setNext(t1.getNext());

            }
            size--;

        }
    }





    //Delete Last Node
    public void deleteLast(){
        if(start==null){
            System.out.println("List is empty");
        }
        else if(size==1) {
            start=null;
            size--;
        }
        else {
            Node t = start;
            for(int i =1; i<size-1 ; i++){
                t = t.getNext();
                t.setNext(null);
                size--;
            }
        }
    }

    //Delete First Node
    public void deleteFirst(){
        if(start==null){
            System.out.println("list is empty");
        }
        else{
            start = start.getNext();
            size--;
        }
    }

    public boolean isEmpty(){
        if(start==null){
            return true;
        }
        else return false;
    }

    public int getListSize(){
        return size;
    }

    public void viewList(){
        Node t;
        if (isEmpty()) {
            System.out.println("List is Empty \n ");
        }else{
            t=start;
            for(int i =1;i<=size;i++){
                System.out.print(" "+t.getData());
            t = t.getNext();
            }
        }
    }



}


public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        boolean flag = true;
        while (flag) {
            System.out.println();
            System.out.println("1.Add Item to the list at start");
            System.out.println("2.Add Item to the list at Last");
            System.out.println("3.Add Item to the list at Position");
            System.out.println("4.Delete first item from list");
            System.out.println("5.Delete last item from list");
            System.out.println("6.Delete Item from the list with given position");
            System.out.println("7.View List");
            System.out.println("8.Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            int val;
            switch (choice){
                case 1:
                    System.out.println("Enter Value");
                    val = sc.nextInt();
                    list.insertAtFirst(val);
                    break;
                case 2:
                    System.out.println("Enter Value");
                     val = sc.nextInt();
                     list.insertAtLast(val);
                     break;

                case 3:
                    System.out.println("Enter Position");
                    int p = sc.nextInt();
                    System.out.println("Enter Value");
                     val = sc.nextInt();
                    list.insertAtPosition(val,p);
                    break;

                case 4: list.deleteFirst();
                        break;

                case 5: list.deleteLast();
                break;

                case 6:
                    System.out.println("Enter Position:");
                        int pos = sc.nextInt();
                        list.deleteAtPosition(pos);
                        break;

                case 7:
                        list.viewList();
                        break;

                case 8: flag=false;
                break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}