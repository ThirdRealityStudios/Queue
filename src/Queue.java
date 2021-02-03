public class Queue
{
    private Node first, last;

    public Queue()
    {

    }

    public void enqueue(Object pObject)
    {
        Node newElement = new Node(pObject);

        if(empty())
        {
            first = newElement;
            last = first;
        }
        else
        {
            last.setNext(newElement);
        }

        last = newElement;
    }

    public Object dequeue()
    {
        Object dequeued = first;

        if(!empty())
        {
            first = first.getNext();
        }

        return dequeued;
    }

    public Object front()
    {
        return null;
    }

    public boolean empty()
    {
        return first == null;
    }
}
