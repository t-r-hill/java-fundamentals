package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

class Exercise_05{

    public static void main(String[] args) {
        Book myBook = new Book(10);
        PageReader reader = new PageReader(myBook);
        PageTurner turner = new PageTurner(myBook);
    }
}

class Book{
    int currentPageNum = 0;
    boolean isCurrentPageRead = false;
    int numPages;

    Book(int numPages){
        this.numPages = numPages;
    }

    public synchronized void readPage(){
        if (currentPageNum == numPages){
            return;
        }
        while (isCurrentPageRead){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        isCurrentPageRead = true;
        System.out.println("Read page " + currentPageNum);
        notifyAll();
    }

    public synchronized void turnPage(){
        if (currentPageNum == numPages){
            return;
        }
        while (!isCurrentPageRead){
            try{
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Turning from page " + currentPageNum);
        currentPageNum++;
        isCurrentPageRead = false;
        System.out.println("Turned to page " + currentPageNum);
        notifyAll();
    }
}

class PageReader implements Runnable{
    Thread thread;
    private Book book;
    String name;
    PageReader(Book book){
        this.book = book;
        thread = new Thread(this);
        thread.start();
    }

    public void run(){
        for (int i = 1; i < book.numPages; i++){
            book.readPage();
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class PageTurner implements Runnable{
    Thread thread;
    private Book book;

    PageTurner(Book book){
        this.book = book;
        thread = new Thread(this);
        thread.start();
    }

    public void run(){
        while(book.currentPageNum < book.numPages){
            book.turnPage();
            try{
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

