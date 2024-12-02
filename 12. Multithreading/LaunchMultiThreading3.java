
class MyThread extends Thread
{
    public void run(){
        System.out.println("child thread");
    }
}
public class LaunchMultiThreading3 
{
    public static void main(String[] args) {
        System.out.println("Main thread");

        MyThread t = new MyThread();
        t.start();
    }
}
