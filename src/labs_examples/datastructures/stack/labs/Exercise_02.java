package labs_examples.datastructures.stack.labs;

import java.util.Arrays;

/**
 *      Stacks - Exercise_02
 *
 *      Write a new custom (Generic) Stack class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Stack class must also do the following: (Ryan Take 2)
 *
 *      1) throw a custom exception when trying to pop an element from an empty Stack
 *      2) resize the Stack (the underlying array) to be twice the size when the Stack is more than 3/4 full
 *      3) resize the Stack (the underlying array) to be half the size when the Stack is more than 1/4 empty
 *      4) contain the methods peekFirst() and peekLast()
 *      5) contain a size() method
 *      6) contain a method to print out the data of all elements in the Stack
 *
 *      TIP: To initialize a new array of a Generic type you can use this:
 *           T[] data = (T[]) new Object[10];
 */

class Exercise_02{

    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack<>();

        for (int i = 0; i < 6; i++){
            stack.put(i);
        }

        System.out.println(stack.toString(true));
        System.out.println(stack.toString(false));

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.toString(true));
        System.out.println(stack.toString(false));

        for (int i = 6; i < 10; i++){
            stack.put(i);
        }

        System.out.println(stack.toString(true));
        System.out.println(stack.toString(false));
    }
}

class CustomStack<T>{
    int top;
    T[] vals;
    int size;

    CustomStack(){
        this.vals = (T[]) new Object[10];
        this.top = 0;
        this.size = 0;
    }

    public void put(T val){
        if (vals[0] == null){
            vals[0] = val;
            size++;
        } else {
            vals[++top] = val;
            size++;
        }

        if (size > vals.length * 0.75){
            resize(true);
        }
    }

    public T pop(){
        if (vals[0] == null){
            throw new EmptyStackException();
        }

        T output = vals[top];
        vals[top] = null;

        top--;
        size--;

        if (size < vals.length * 0.25){
            resize(false);
        }

        return output;
    }

    public T peekFirst(){
        return vals[top];
    }

    public T peekLast(){
        return vals[0];
    }

    public void resize(boolean up){
        T[] oldVals = vals;

        if (up){
            vals = (T[]) new Object[vals.length * 2];
            for (int i = 0; i < size; i++){
                vals[i] = oldVals[i];
            }
        } else {
            vals = (T[]) new Object[vals.length / 2];
            for (int i = 0; i < size; i++){
                vals[i] = oldVals[i];
            }
        }
    }

    public String toString(boolean topFirst){
        String output = "";
        if (topFirst){
            for (int i = 0; i < size; i++){
                output += vals[i] + " ";
            }
        } else {
            for (int i = 0; i < size; i++){
                output += vals[size - i - 1] + " ";
            }
        }
        return output;
    }
}

class EmptyStackException extends NullPointerException{};