package cww327;

public class Sequence {
    static class Node{
        public int val;
        Node next =  null;
        public Node(int val) {
            this.val = val;
        }
    }
    private Node head = null;
    private  Node tail = null;
    //入队列
    public void offer(int val){   //队列Offer
        Node newNode =  new Node(val);
        if(head==null){
            head= newNode;
            tail= newNode;
        }
        tail.next= newNode;
        tail=tail.next;
    }
}
