public class FloydAlgorithm{


static class Node{
    int value;
    Node next;

    Node(int d){
        this.value=d;
        this.next=null;
    }

    public String toString(){
        System.out.println("Node : "+ this.value);
        return this.value+"";
    }

}


public static void main(String args[]){

    Node Head= new Node(1);
    Head.next= new Node(2);
    Head.next.next= new Node(3);
    Head.next.next.next= new Node(4);
    Head.next.next.next.next= new Node(5);
    Head.next.next.next.next.next= new Node(6);

    //for(int i=0;i<3;i++){
        System.out.println(Head);
        System.out.println(Head.next);
        System.out.println(Head.next.next);
        System.out.println(Head.next.next.next);
        System.out.println(Head.next.next.next.next);

   // }


}


}