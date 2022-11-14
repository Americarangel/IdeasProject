import java.util.ArrayList;

    public class CS112Stack<E> {

        Node<E> theStack = null;

        public void push(E toPush) {
            theStack =  new Node(toPush,theStack);
        }

        public boolean isEmpty() {
            return theStack == null;
        }

        public E pop() {
            if (isEmpty())
                return null;
            else {
                E top = theStack.getData();
                theStack = theStack.next;
                return top;
            }
        }

        public E top() {
            if (isEmpty())
                return null;
            else {
                return theStack.getData();
            }
        }

        public void printStack() {
            if (theStack == null)
                System.out.println("Empty Stack");
            else theStack.print();;
        }



    }
