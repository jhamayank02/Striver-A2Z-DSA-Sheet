class P4_Count_nodes_of_linked_list{

    public static int length(Node head){
        
        // Iterative approach
        // T.C O(n) || S.C O(1)
        // Node temp = head;
        // int len = 0;
        // while(temp != null){
        //     temp = temp.next;
        //     len++;
        // }
        // return len;


        // Recursive approach
        // T.C O(n) || S.C O(n)
        if(head == null){
            return 0;
        }
        return 1 + length(head.next);
    }

    public static void main(String args[]){

    }
}