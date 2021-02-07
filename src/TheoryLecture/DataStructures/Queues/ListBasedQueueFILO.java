package TheoryLecture.DataStructures.Queues;

public class ListBasedQueueFILO {

    private Node head;

    public ListBasedQueueFILO() {
        this.head = null;
    }

    public void enqueue(Element element) {
        this.head = new Node(element, this.head);
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
