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
        queue.enqueue("TEST1");

        System.out.println(((Node) queue.dequeue()).getContent());

        queue.enqueue("TEST2");
        System.out.println(((Node) queue.dequeue()).getContent());
        System.out.println(((Node) queue.dequeue()).getContent());
    }
}
