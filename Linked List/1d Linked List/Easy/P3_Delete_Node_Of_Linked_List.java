class P3_Delete_Node_Of_Linked_List{

    public static Node deleteLast(Node list){
        // T.C O(n) || S.C O(1)
        Node head = list;
        Node temp = list;

        while(temp.next != null && temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;
        return head;
    }

    public static void main(String args[]){

    }
}