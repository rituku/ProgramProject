class LinkedList {
    Node head; // head of the list

    /* Linked List node */
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    /* Function to get the Nth node from the last of a
       linked list */
    void printNthFromLast(Node head, int N)
    {
        int i = 0;

        if (head == null)
            return;
        printNthFromLast(head.next, N);

        if (++i == N)
            System.out.print(head.data);
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {

        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    // Driver's code
    public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);

        // Function call
        llist.printNthFromLast(llist.head, 4);
    }
}