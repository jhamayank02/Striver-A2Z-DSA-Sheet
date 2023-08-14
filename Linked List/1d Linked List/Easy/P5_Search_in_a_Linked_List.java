class P5_Search_in_a_Linked_List{

    public static int searchInLinkedList(Node head, int k)
    {   
        // T.C O(n) || S.C O(1)
        Node temp = head;

        while(temp != null && temp.data != k){
            temp = temp.next;
        }
        if(temp == null){
            return 0;
        }
        return 1;
    }

    public static void main(String args[]){

    }
}