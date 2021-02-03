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

    /**
     * @return the first object in the Queue
     */
    public Object front()
    {
        return first;
    }

    public boolean empty()
    {
        return first == null;
    }
}
