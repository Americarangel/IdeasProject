public class Test {
        public static void main(String[] args) {

            /* I know this does not wok, something is wrong with myQueue methods but I could not figure out what*/

            MyQueue3 Q = new MyQueue3();

            System.out.println("Queue:");
            Q.enqueue(9);
            Q.enqueue(8);
            Q.enqueue(7);
            Q.enqueue(6);
            Q.enqueue(5);
            Q.enqueue(4);
            Q.enqueue(7);
            Q.enqueue(3);
            Q.enqueue(2);
            Q.enqueue(1);

            Q.writeQueue();
//            System.out.println("dequeue");
            Q.dequeue();
            Q.dequeue();
            Q.dequeue();
            Q.dequeue();
            System.out.println("Updated queue: ");
            Q.writeQueue();
        }
    }
