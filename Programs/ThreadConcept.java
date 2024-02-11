class A extends Thread {
    public void run() {
        for (var i = 0; i <= 10; i++) {
            System.out.println("Sakethhh");
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){e.printStackTrace();}
        }
    }
}

class B extends Thread {
    public void run() {
        for (var i = 0; i <= 10; i++) {
            System.out.println("Reddyyy");
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){e.printStackTrace();}
        }
    }
}

public class ThreadConcept {
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();

        t1.start();
        try{
            Thread.sleep(10);
        }
        catch(InterruptedException e){e.printStackTrace();}
        t2.start();
    }
}
