class P3_Delete_Last_Node_of_a_Doubly_Linked_List{

    public static Node deleteLastNode(Node head) {
        // T.C O(n) || S.C O(1)
        Node prev = null;
        Node curr = head;

        while(curr != null && curr.next != null){
            prev = curr;
            curr = curr.next;
        }

        if(prev == null){
            return null;
        }
        prev.next = null;
        return head;
    }

    public static void main(String args[]){

    }
}