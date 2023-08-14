class P2_Insert_Node_At_The_Beginning{

    public static Node insertAtFirst(Node list, int newValue) {
        // T.C O(1) || S.C O(1)
        Node head = list;
        Node temp = new Node(newValue);
        temp.next = head;
        head = temp;
        return head;
    }

    public static void main(String args[]){

    }
}