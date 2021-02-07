package TheoryLecture.DataStructures.Queues;

public class ArrayBaseQueueFIFO {

    private static final int SIZE = 10;
    private Element[] elements;
    private int counter;

    public ArrayBaseQueueFIFO() {
        this.elements = new Element[ArrayBaseQueueFIFO.SIZE];
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
        Element el = this.elements[0];
        shift();
        counter--;
        return el;
    }

    public boolean empty() {
        return counter == 0;
    }

    private void shift() {
        for (int i = 1; i < counter; i++)
            this.elements[i - 1] = this.elements[i];
    }
}