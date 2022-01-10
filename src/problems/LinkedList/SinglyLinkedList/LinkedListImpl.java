package problems.LinkedList.SinglyLinkedList;
public class LinkedListImpl {

    public LinkedListImpl() {
    }
    public static void main(String[] args) {      
    }
    public static int getLength(LinkedList data) {
        int length =0;
        LinkedList currentNode = data;
        while(currentNode != null) {
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }
    public static void insertionLL(LinkedList headNode, LinkedList ItemtoInsert, int position) {
        if(headNode == null) {

        }
    }
}
