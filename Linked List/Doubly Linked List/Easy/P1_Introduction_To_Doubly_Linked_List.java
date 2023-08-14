class P1_Introduction_To_Doubly_Linked_List{

    public static Node constructDLL(int []arr) {
        // T.C O(n) || S.C O(n)
        Node head = null;
        Node prev = null;

        for(int elem : arr){
            if(head == null){
                head = new Node(elem);
                prev = head;
            }
            else{
                Node newNode = new Node(elem);
                newNode.prev = prev;
                prev.next = newNode;
                prev = newNode;
            }
        }
        return head;
    }

    public static void main(String args[]){

    }
}