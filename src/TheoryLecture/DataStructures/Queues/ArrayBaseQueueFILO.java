package TheoryLecture.DataStructures.Queues;

public class ArrayBaseQueueFILO {

    private static final int SIZE = 10;
    private Element[] elements;
    private int counter;

    public ArrayBaseQueueFILO() {
        this.elements = new Element[ArrayBaseQueueFILO.SIZE];
        this.counter = 0;
    }

    public void enqueue(Element element) {
        if (counter >= elements.length)
            throw new RuntimeException("queue full");
        this.elements[counter++] = element;
    }

    public Element dequeue() {
        if (counter == 0)
            throw new RuntimeException("queue empty");
        return this.elements[--counter];
    }

    public boolean empty() {
        return counter == 0;
    }
}
