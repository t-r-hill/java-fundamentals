package labs_examples.datastructures.linkedlist.labs;

/**
 *      LinkedLists - Exercise_02
 *
 *      Write your own custom LinkedList class. Although it can mimic the CustomLinkedList
 *      class we used here, it must be entirely unique. Please also add at least two
 *      additional helper methods that you think could be useful. Refer to Java's built-in
 *      LinkedList class for inspiration. Your new LinkedList class should ONLY allow users
 *      to add and remove elements from the front of the list AND the end of the list.
 *      Also, instead of using the index in the get() and remove() methods, these methods should
 *      get() and remove() based by the Node's value, not it's index.
 */

class CustomLinkedList<T>{
    int length;
    LinkedNode<T> head;

    CustomLinkedList() {
        this.length = 0;
        this.head = null;
    }

    public void add(T value, boolean addHead) {
        if (length == 0){
            this.head = new LinkedNode<T>(value);
        } else if (addHead) {
            LinkedNode<T> oldHead = this.head;
            this.head = new LinkedNode<T>(value, oldHead);
        } else {
            LinkedNode<T> node = this.head;
            while (node.next != null){
                node = node.next;
            }
            node.next = new LinkedNode<T>(value);
        }
        length++;
    }

    public T remove(boolean fromHead){
        T removed;

        if (length == 0){
            throw new ArrayIndexOutOfBoundsException();
        } else if (fromHead) {
            removed = this.head.value;
            this.head = this.head.next;
        } else {
            LinkedNode<T> node = this.head;
            while (node.next != null){
                node = node.next;
            }
            removed = node.value;
            node.next = null;
        }
        length--;
        return removed;
    }

    public T get(T value){
        LinkedNode<T> node = this.head;

        if (length == 0){
            throw new ArrayIndexOutOfBoundsException();
        } else {
            while (node.value != value){
                node = node.next;
            }
        }
        return node.value;
    }
}

class LinkedNode<T>{
    LinkedNode next;
    T value;

    LinkedNode(T value, LinkedNode next){
        this.value = value;
        this.next = next;
    }

    LinkedNode(T value){
        this.value = value;
        this.next = null;
    }
}