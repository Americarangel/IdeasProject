public class CS112QueueB implements CS112QueueInterface{

        private int[] theQ;
        private int front;
        private int back;
        private int count;

        public CS112QueueB(int initialSize) {
            theQ = new int[initialSize]; //the array that needs to be printed
            front = 0;
            back = -1;
            count = 0;
        }

        public CS112QueueB() {
            this(4);
        }
        /* this method should write only the actual elements in the queue, starting
         * with the element in the front and ending with the last element.
         * It should NOT write all the elements in the array,
         */
        public void writeQueue() { //FIX THIS TO FIX WHERE THE 9 IS BEING PRINTED
            for(int i = front; i <= back; i++)
                System.out.println(theQ[i]+ " ");
        }

        public void writeArray() {
            System.out.println("___________ Writing Queue Array Info_______");
            System.out.println("front: "+front);
            System.out.println("back : "+back);
            System.out.println("count: "+count);

            for (int i=0; i<theQ.length;i++)
                System.out.print(theQ[i]+" ");
            System.out.println();
            System.out.println("_____________________________________________");
            System.out.println();

        }

        public void enqueue(int toBeAdded) {
            if (full())
                expand();
            else if (bumped())
                back = -1;

            back = back+1;
            theQ[back] = toBeAdded;
            count = count+1;

        }

        private void shiftBack() {
            for (int i = 0; i < count; i++)
                theQ[i] = theQ[front + i];
            back = back - front;
            front = 0;
        }

        private void expand() {
            int[] newQ = new int[theQ.length*2];
            if (back < front) { //pointer(s)
                for (int i = 0; i <= back; i++) {
                    newQ[i] = theQ[i];
                }
                for (int i = front + theQ.length; i < newQ.length; i++) {
                    newQ[i] = theQ[i - theQ.length];
                    front = front + theQ.length;
                }
                theQ = newQ;
            }
            else if (front < back)
                for(int i =0; i < theQ.length; i++) {
                    newQ[i] = theQ[i];
                }
            theQ = newQ;
        }

        private boolean bumped() {
            return back == theQ.length-1;
        }

        private boolean full() {
            return count == theQ.length;
        }


        public int dequeue()  {
            if (isEmpty()) {
                return -978;
            }
            else  {
                int toR = theQ[front];
                front = front + 1;
                count = count - 1;
                return toR;
            }
        }

        public int peek( ) {
            if (isEmpty()) {
                return -978;
            }
            else  {
                return theQ[front];

            }
        }



        public boolean isEmpty() {
            return count == 0;
        }
    }
