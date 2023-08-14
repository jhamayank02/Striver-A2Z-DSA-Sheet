class P2_Insert_at_end_of_Doubly_Linked_List{

    public static Node insertAtTail(Node list, int K) {
        // T.C O(n) || S.C O(1)
        Node prev = list;

        while(prev != null && prev.next != null){
            prev = prev.next;
        }

        Node newNode = new Node(K, null, prev);
        if(prev == null){
            return newNode;
        }

        prev.next = newNode;

        return list;
    }

    public static void main(String args[]){

    }
}