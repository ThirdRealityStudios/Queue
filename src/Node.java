public class Node
{
    Node next;
    Object content;

    public Node(Object content)
    {
        this.content = content;
    }

    public void setContent(Object content)
    {
        this.content = content;
    }

    public Object getContent()
    {
        return content;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

    public Node getNext()
    {
        return next;
    }
}
