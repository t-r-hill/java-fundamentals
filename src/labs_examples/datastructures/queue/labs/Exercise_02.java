package labs_examples.datastructures.queue.labs;

/**
 *      Queues - Exercise_02
 *
 *      Write a new custom (Generic) Queue class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Queue class must also do the following:
 *
 *      1) throw a custom exception when trying to pop  an element from an empty Queue
 *      2) resize the Queue (the underlying array) to be twice the size when the Queue is more than 3/4 full
 *      3) resize the Queue (the underlying array) to be half the size when the Queue is more than 1/4 empty
 *      4) contain the methods peekFirst() and peekLast()
 *      5) contain a size() method
 *      6) contain a method to print out the data of all elements in the Queue
 *
 */

class Exercise_02{

    public static void main(String[] args) {
        CustomQueue<Integer> q = new CustomQueue<>(10);
        for (int i = 0; i < 5; i++){
            q.push(i);
        }

        System.out.println(q.pop());
        System.out.println(q.pop());

        q.push(5);
        q.push(6);

        System.out.println(q.pop());
        System.out.println(q.pop());

        q.push(7);
        q.push(8);

        System.out.println(q.pop());
        System.out.println(q.pop());

        q.push(9);
        q.push(10);

        System.out.println(q.pop());
        System.out.println(q.pop());

        q.push(11);
        q.push(12);
        q.push(13);
        q.push(14);
        q.push(15);

        System.out.println(q.toString());
    }
}

class CustomQueue<T>{
    int front;
    T[] vals;
    int back;

    CustomQueue(int size){
        this.vals = (T[]) new Object[10];
        front = 0;
        back = 0;
    }

    public void push(T val){
        if (vals[front] == null){
            vals[0] = val;
            front = 0;
            back = 0;
        } else {
            back = (back + 1) % vals.length;
            vals[back] = val;
        }

        if (size() > vals.length * 0.75){
            resize(true);
        }
    }

    public T pop() {
        if (vals[front] == null){
            throw new EmptyQueueException();
        }

        T item = vals[front];
        vals[front] = null;
        front = (front + 1) % vals.length;

        if (size() < vals.length * 0.25){
            resize(false);
        }

        return item;
    }

    public void resize(boolean up){
        int oldSize = size();
        T[] oldVals = this.vals;

        if (up){
            this.vals = (T[]) new Object[vals.length * 2];
        } else{
            this.vals = (T[]) new Object[vals.length / 2];
        }

        for (int i = 0; i < oldSize; i++){
            vals[i] = oldVals[(front + i) % oldVals.length];
        }
        front = 0;
        back = oldSize - 1;
    }

    public int size(){
        if (vals[front] == null){
            return 0;
        } else if(back < front){
            return vals.length - front + back + 1;
        } else {
            return back - front + 1;
        }
    }

    public T peekFirst(){
        return vals[front];
    }

    public T peekLast(){
        return vals[back];
    }

    public String toString(){
        String output = "";
        for (int i = 0; i < size(); i++){
            output += vals[(front + i) % vals.length] + " ";
        }
        return output;
    }
}

class EmptyQueueException extends NullPointerException{

}