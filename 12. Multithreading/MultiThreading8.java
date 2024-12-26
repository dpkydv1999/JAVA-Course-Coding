
class Printing implements Runnable
{
    public void run()
    {
        try{
            for(int i=0;i<4;i++){
                System.out.println("Focus is important");
                Thread.sleep(300);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("some problem");
        }
    }
}


public class MultiThreading8 
{
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Main thread started");

        Printing p = new Printing();

        Thread t1 = new Thread(p);
        t1.start();
        t1.join();


        System.out.println("Main thread finished the work");
    }
}
