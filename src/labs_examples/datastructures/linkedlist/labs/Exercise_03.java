package labs_examples.datastructures.linkedlist.labs;

/**
 *      LinkedLists - Exercise_02
 *
 *      Please create your own custom doubly-LinkedList from start to finish :) You got this!
 */

class Exercise_02{
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        for (int i = 0; i < 10; i++){
            list.put(i, true);
        }
        System.out.println(list.toString(true));
        System.out.println(list.get(0));
        System.out.println(list.get(4));
        System.out.println(list.get(8));

        System.out.println(list.pop(true));
        System.out.println(list.pop(false));

        System.out.println(list.toString(true));
    }
}

class DoubleLinkedList<T>{
    int length;
    DoubleNode<T> head;
    DoubleNode<T> tail;

    public DoubleLinkedList(){
    }

    public void put(T value, boolean atHead){
        if (length == 0){
            this.head = new DoubleNode<T>(value);
            this.tail = this.head;
        } else if (atHead){
            DoubleNode<T> oldHead = this.head;
            this.head.prior = new DoubleNode<T>(value, null, oldHead);
            this.head = this.head.prior;
        } else {
            DoubleNode<T> oldTail = this.tail;
            this.tail.next = new DoubleNode<T>(value, oldTail, null);
            this.tail = this.tail.next;
        }
        length++;
    }

    public T get(int index){
        if (length == 0){
            return null;
        } else if( index > length/2){
            DoubleNode<T> node = this.tail;
            int count = 0;
            while (count != (length - 1 - index)){
                node = node.prior;
                count++;
            }
            return node.value;
        } else {
            DoubleNode<T> node = this.head;
            int count = 0;
            while (count != index){
                node = node.next;
                count++;
            }
            return node.value;
        }
    }

    public T pop(boolean fromHead){
        DoubleNode<T> node;
        if (length == 0){
            return null;
        } else if(fromHead){
            node = this.head;
            this.head.next.prior = null;
            this.head = this.head.next;
        } else {
            node = this.tail;
            this.tail.prior.next = null;
            this.tail = this.tail.prior;
            }
        return node.value;
    }

    public String toString(boolean fromHead){
        String list = "";
        DoubleNode<T> node;
        if (fromHead){
            node = this.head;
            while (node != null){
                list += node.value + ", ";
                node = node.next;
            }
        } else {
            node = this.tail;
            while (node != null){
                list += node.value + ", ";
                node = node.prior;
            }
        }
        return list;
    }
}

class DoubleNode<T>{
    DoubleNode<T> next;
    DoubleNode<T> prior;
    T value;

    DoubleNode(T value){
        this.value = value;
        this.next = null;
        this.prior = null;
    }

    DoubleNode(T value, DoubleNode<T> prior, DoubleNode<T> next){
        this.value = value;
        this.next = next;
        this.prior = prior;
    }
}