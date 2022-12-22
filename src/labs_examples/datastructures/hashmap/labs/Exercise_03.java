package labs_examples.datastructures.hashmap.labs;

import java.util.*;

/**
 *      HashMaps Exercise_02
 *
 *      Create a new class that does the following:
 *
 *      1) create a LinkedList
 *      2) create a Stack
 *      3) create a Queue
 *      4) create a HashMap
 *
 *      Then, add millisecond timers before and after each data structure above and print out
 *      how long it takes for each to complete EACH the following tasks, and the total time for
 *      each data structure:
 *
 *      1) add 100 elements
 *      2) update 100 elements
 *      3) search for 100 elements
 *      4) delete 100 elements
 */

class Exercise_03{

    public static void main(String[] args) {
        List<Integer> listDemo = new LinkedList<Integer>();
        Stack<Integer> stackDemo = new Stack<Integer>();
        Queue<Integer> queueDemo = new PriorityQueue<Integer>();
        Map<Integer, Integer> mapDemo = new HashMap<Integer, Integer>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            listDemo.add(i);
        }
        long addTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            listDemo.set(i, i * 2);
        }
        long setTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            listDemo.get(i);
        }
        long getTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            listDemo.remove(0);
        }
        long delTime = System.currentTimeMillis();

        System.out.println("List");
        System.out.println("Total time = " + (delTime - startTime));
        System.out.println("Add time = " + (addTime - startTime));
        System.out.println("Update time = " + (setTime - addTime));
        System.out.println("Search time = " + (getTime - setTime));
        System.out.println("Delete time = " + (delTime - getTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            stackDemo.add(i);
        }
        addTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            stackDemo.set(i, i * 2);
        }
        setTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            stackDemo.get(i);
        }
        getTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            stackDemo.pop();
        }
        delTime = System.currentTimeMillis();

        System.out.println("Stack");
        System.out.println("Total time = " + (delTime - startTime));
        System.out.println("Add time = " + (addTime - startTime));
        System.out.println("Update time = " + (setTime - addTime));
        System.out.println("Search time = " + (getTime - setTime));
        System.out.println("Delete time = " + (delTime - getTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            queueDemo.add(i);
        }
        addTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            queueDemo.remove(i);
            queueDemo.add(i*2);
        }
        setTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            queueDemo.contains(i);
        }
        getTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            queueDemo.remove(i);
        }
        delTime = System.currentTimeMillis();

        System.out.println("Queue");
        System.out.println("Total time = " + (delTime - startTime));
        System.out.println("Add time = " + (addTime - startTime));
        System.out.println("Update time = " + (setTime - addTime));
        System.out.println("Search time = " + (getTime - setTime));
        System.out.println("Delete time = " + (delTime - getTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            mapDemo.put(i,i);
        }
        addTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            mapDemo.replace(i, i * 2);
        }
        setTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            mapDemo.get(i);
        }
        getTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            mapDemo.remove(i);
        }
        delTime = System.currentTimeMillis();

        System.out.println("Map");
        System.out.println("Total time = " + (delTime - startTime));
        System.out.println("Add time = " + (addTime - startTime));
        System.out.println("Update time = " + (setTime - addTime));
        System.out.println("Search time = " + (getTime - setTime));
        System.out.println("Delete time = " + (delTime - getTime));
    }
}