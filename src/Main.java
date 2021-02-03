public class Main
{
    private Queue queue;

    public static void main(String[] args)
    {
        Main m = new Main();

        m.run();
    }

    private void run()
    {
        queue = new Queue();

        queue.enqueue("Hello world!");
        System.out.println(queue.front());
        queue.enqueue("TEST1");
        System.out.println(queue.front());

        System.out.println(queue.dequeue());

        queue.enqueue("TEST2");
        System.out.println(queue.front());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        
        // System.out.println(queue.dequeue()); 
        	// is a test, will throw a java.lang.NullPointerException
    }
}
