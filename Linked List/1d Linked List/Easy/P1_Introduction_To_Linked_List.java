class P1_Introduction_To_Linked_List{

    public static Node constructLL(int []arr) {
        // T.C O(n) || S.C O(n)
        Node head = null;
        Node tail = null;

        for(int elem : arr){
            Node temp = new Node(elem);

            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
        }

        return head;
    }

    public static void main(String args[]){

    }
}