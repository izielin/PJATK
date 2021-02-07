package TheoryLecture.DataStructures.Queues;

public class Node {

    private Element element;
    private Node next;

    public Node(Element element) {
        this.element = element;
        this.next = null;
    }

    public Node(Element element, Node next) {
        this.element = element;
        this.next = next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public Element getElement() {
        return element;
    }
}
