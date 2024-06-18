class ListNode {
    int data;
    ListNode next;
    public ListNode(int data){
        this.data = data;
        next = null;
    }
}



public class LinkedList{
    ListNode head;
    public void addElement(int data){
        if(head == null) {
            head = new ListNode(data);
        }
        else{
            ListNode p = head;
            while(true){
                if(p.next == null){
                    p.next = new ListNode(data);
                    break;
                }
                p = p.next;
            }
        }
    }

    public void display(){
        ListNode p = head;
        if(this.head == null){
            System.out.println("There are no elements in the list");
        }
        else if(head.next == null){
            System.out.println(head.data);
        }
        else{
            while(p != null){
                System.out.println(p.data);
                p = p.next;
            }
        }

    }

    public void insertAtEnd(int val){
        ListNode p = new ListNode(val);
        if(head == null){
            head = p;
        }
        else{
            ListNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = p;
        }
    }

    public void deleteAtPosition(int position){
        if (head == null) {
            return;
        }

        ListNode temp = head;

        // If position is 0, delete the head node
        if (position == 0) {
            head = temp.next; // Move head to next node
            return;
        }

        // Find the node just before the position to be deleted
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        // If position is more than number of nodes
        if (temp == null || temp.next == null) {
            return;
        }

        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        ListNode next = temp.next.next;

        // Unlink the node from the linked list
        temp.next = next;
    }




    public void reverse(){
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }

        head = prev;
    }

    public void findMiddleElement(){
        

    }
    public void detectLoop(){

    }

    public static void main(String[] args){
        LinkedList myList = new LinkedList();

        myList.addElement(10);
        myList.addElement(20);
        myList.addElement(30);
        myList.addElement(40);
        myList.addElement(50);
        myList.insertAtEnd(60);
        myList.deleteAtPosition(1);
        myList.display();
    }
}