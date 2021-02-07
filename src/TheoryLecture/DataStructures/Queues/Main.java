package TheoryLecture.DataStructures.Queues;

public class Main {
    public static void main(String[] args) {
        Element e1 = new Element("Jeden");
        Element e2 = new Element("Dwa");
        Element e3 = new Element("Trzy");
        Element e4 = new Element("Cztery");

        ArrayBaseQueueFILO aq1 = new ArrayBaseQueueFILO();

        aq1.enqueue(e1);
        aq1.enqueue(e2);
        aq1.enqueue(e3);
        aq1.enqueue(e4);

        while (!aq1.empty())
            System.out.println(
                    aq1.dequeue()
            );
/*
        ArrayBaseQueue tmp = new ArrayBaseQueue();
        while (!aq1.empty())
            tmp.enqueue(
                aq1.dequeue()
            );
        while (!tmp.empty())
            System.out.println(
                tmp.dequeue()
            );
*/
        ArrayBaseQueueFIFO aq2 = new ArrayBaseQueueFIFO();

        aq2.enqueue(e1);
        aq2.enqueue(e2);
        aq2.enqueue(e3);
        aq2.enqueue(e4);

        while (!aq2.empty())
            System.out.println(
                    aq2.dequeue()
            );
//===================================================================

        ListBasedQueue lq1 = new ListBasedQueue();

        lq1.enqueue(e1);
        lq1.enqueue(e2);
        lq1.enqueue(e3);
        lq1.enqueue(e4);

        System.out.println("****************************");

        while (!lq1.empty())
            System.out.println(
                    lq1.dequeue()
            );
    }
}
