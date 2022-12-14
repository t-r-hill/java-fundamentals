package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

class Exercise_04{
    public static void main(String[] args) {
        Incrementer inc = new Incrementer();
        SyncRunnableThread myRunnableThread = new SyncRunnableThread("My Runnable Thread", inc);
        SyncRunnableThread myRunnableThread2 = new SyncRunnableThread(inc);
        Thread myThread = new Thread(myRunnableThread2, "My Runnable Thread 2");
        myThread.start();
    }
}

class SyncRunnableThread implements Runnable{
    Thread thread;
    Incrementer incrementer;

    SyncRunnableThread(String name, Incrementer obj){
        thread = new Thread(this, name);
        incrementer = obj;
        thread.start();

    }

    SyncRunnableThread(Incrementer obj){
        incrementer = obj;
    }

    @Override
    public void run(){
        System.out.println("Starting " + Thread.currentThread().getName());
        synchronized (incrementer){
            incrementer.increment();
        }
        System.out.println("Finishing " + Thread.currentThread().getName());
    }
}

class Incrementer{
    int total = 0;

    public void increment(){
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