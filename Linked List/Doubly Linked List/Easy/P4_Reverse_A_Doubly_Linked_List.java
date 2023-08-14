class P4_Reverse_A_Doubly_Linked_List{

    public static Node insertAtHead(Node head, int d){
        // T.C O(n) || S.C O(1)
        Node newNode = new Node(d);
        if(head == null){
            return newNode;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return head;
    }

    public static Node reverseDLL(Node head)
    {   
        // T.C O(n) || S.C O(n)
        // Node newHead = null;
        // Node temp = head;

        // while(temp != null){
        //     newHead = insertAtHead(newHead, temp.data);
        //     temp = temp.next;
        // }

        // return newHead;


        // T.C O(n) || S.C O(1)
        Node curr = head;
        Node next = null;
        Node prev = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void main(String args[]){

    }
}