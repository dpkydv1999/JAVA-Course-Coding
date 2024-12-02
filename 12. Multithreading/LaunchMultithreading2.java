public class LaunchMultithreading2 
{
    public static void main(String[] args) {
        System.out.println("Main thread");
        System.out.println("Before changing");
        String name = Thread.currentThread().getName();
        System.out.println("Name of main thread " +name);
        System.out.println("Priority of main thread " +Thread.currentThread().getPriority());

        System.out.println("After changing");
        Thread t = new Thread();
        t.setName("mul");
        t.setPriority(2);

        String name1 = Thread.currentThread().getName();
        System.out.println("Name of main thread " +name1);
        System.out.println("Priority of main thread " +Thread.currentThread().getPriority());

    }
}
