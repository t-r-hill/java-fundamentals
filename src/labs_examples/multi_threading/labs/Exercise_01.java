package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

class Exercise_01{

    public static void main(String[] args) {
        RunnableThread myRunnableThread = new RunnableThread("My Runnable Thread");
        RunnableThread myRunnableThread2 = new RunnableThread();
        Thread myThread = new Thread(myRunnableThread2, "My Runnable Thread 2");
        myThread.start();
    }
}

class RunnableThread implements Runnable{
    Thread thread;

    RunnableThread(String name){
        thread = new Thread(this, name);
        thread.start();

    }

    RunnableThread(){
    }

    @Override
    public void run(){
        System.out.println("Starting " + Thread.currentThread().getName());
        try {
            for(int count=0; count<10; count++) {
                // put this thread to sleep for 400 milliseconds
                Thread.sleep(400);
                System.out.println("In " + Thread.currentThread().getName() +
                        ", count is " + count);
            }
        }
        // catch the potential exception
        catch(InterruptedException exc) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " terminating.");

    }
}
