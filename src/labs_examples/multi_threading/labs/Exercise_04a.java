package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

class Exercise_04a{
    public static void main(String[] args) {
        Incrementera inc = new Incrementera();
        SyncRunnableThreada myRunnableThread = new SyncRunnableThreada("My Runnable Thread", inc);
        SyncRunnableThreada myRunnableThread2 = new SyncRunnableThreada(inc);
        Thread myThread = new Thread(myRunnableThread2, "My Runnable Thread 2");
        myThread.start();
    }
}

class SyncRunnableThreada implements Runnable{
    Thread thread;
    Incrementera incrementer;

    SyncRunnableThreada(String name, Incrementera obj){
        thread = new Thread(this, name);
        incrementer = obj;
        thread.start();

    }

    SyncRunnableThreada(Incrementera obj){
        incrementer = obj;
    }

    @Override
    public void run(){
        System.out.println("Starting " + Thread.currentThread().getName());
            incrementer.increment();
        System.out.println("Finishing " + Thread.currentThread().getName());
    }
}

class Incrementera{
    int total = 0;

    public synchronized void increment(){
        System.out.println("Beginning increment. Total = " + total);
        try{
            for (int i =0; i < 5; i++) {
                Thread.sleep(400);
                total++;
                System.out.println("Total = " + total);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Finished increment. Total = " + total);
    }
}