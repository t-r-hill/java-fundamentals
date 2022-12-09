package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

class Exercise_06{

    public static void main(String[] args) {
        CountToNum countTo100 = new CountToNum(100);
        Counter counterOne = new Counter("one", countTo100);
        Counter counterTwo = new Counter("two", countTo100);
        Counter counterThree = new Counter("three", countTo100);
    }
}

class CountToNum{
    int currentNum = 1;
    int endNum;

    CountToNum(int num){
        this.endNum = num;
    }

    public synchronized void count1(){
        while(currentNum % 3 != 1){
            try{
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        currentNum++;
        System.out.println("Current count = " + currentNum);
        notifyAll();
    }

    public synchronized void count2(){
        while(currentNum % 3 != 2){
            try{
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        currentNum++;
        System.out.println("Current count = " + currentNum);
        notifyAll();
    }

    public synchronized void count3(){
        while(currentNum % 3 != 0){
            try{
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        currentNum++;
        System.out.println("Current count = " + currentNum);
        notifyAll();
    }
}

class Counter implements Runnable{
    Thread thread;
    private CountToNum countToNum;

    Counter(String name, CountToNum countToNum){
        this.countToNum = countToNum;
        thread = new Thread(this, name);
        thread.start();
    }

    public void run(){
        if (Thread.currentThread().getName().contains("one")){
            while(countToNum.currentNum < countToNum.endNum){
                countToNum.count1();
            }
        }
        if (Thread.currentThread().getName().contains("two")){
            while(countToNum.currentNum < countToNum.endNum){
                countToNum.count2();
            }
        }
        if (Thread.currentThread().getName().contains("three")){
            while(countToNum.currentNum < countToNum.endNum){
                countToNum.count3();
            }
        }
    }
}