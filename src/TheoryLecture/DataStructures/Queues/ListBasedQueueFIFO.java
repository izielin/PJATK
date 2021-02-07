package TheoryLecture.DataStructures.Queues;

public class ListBasedQueueFIFO {

    private Node head;

    public ListBasedQueueFIFO() {
        this.head = null;
    }

    public void enqueue(Element element) {
        if (head == null)
            this.head = new Node(element);
        else {
            Node tmp = this.head;
            while (tmp.getNext() != null)
                tmp = tmp.getNext();
            tmp.setNext(
                    new Node(element)
            );
        }
    }

    public Element dequeue() {
        Node tmp = this.head;
        this.head = tmp.getNext();
        return tmp.getElement();
    }

    public boolean empty() {
        return this.head == null;
    }
}
