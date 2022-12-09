package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class Exercise_02{

    public static void main(String[] args) {
        MyThread myThread = new MyThread("My Thread");
        MyThread myThread1 = new MyThread("My Thread 1");
        MyThread myThread2 = new MyThread("My Thread 2");
        MyThread myThread3 = new MyThread("My Thread 3");

        myThread.setPriority(10);
        myThread3.setPriority(1);
    }
}

class MyThread extends Thread {

    MyThread(String name) {
        super();
        this.setName(name);
        start();
    }

    @Override
    public void run() {
        System.out.println("Starting " + this.getName());
        try {
            for (int count = 0; count < 10; count++) {
                // put this thread to sleep for 400 milliseconds
                Thread.sleep(400);
                System.out.println("In " + this.getName() +
                        ", count is " + count);
            }
        }
        // catch the potential exception
        catch (InterruptedException exc) {
            System.out.println(this.getName() + " interrupted.");
        }
        System.out.println(this.getName() + " terminating.");
    }
}