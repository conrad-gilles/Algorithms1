package HW2;

import java.util.Stack;

public class Problem4QueueUsingStacks {
    static class Queue {
        Stack<Integer> s1;
        Stack<Integer> s2;

        public Queue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
    }

        public void queue(int a) {
            s1.push(a);
    }

     public int dequeue() {
        if (s2.isEmpty()) {
         while (!s1.isEmpty()) {
        s2.push(s1.pop());
         }
        }
        return s2.pop();
        }
    }
public static void main(String[] args) {
    Queue queue = new Queue();
    queue.queue(1);
        queue.queue(2);
        queue.queue(3);
System.out.println("Dequeue->" + queue.dequeue());
        System.out.println("Dequeue->" + queue.dequeue());
queue.queue(4);
        System.out.println("Dequeue->" + queue.dequeue());
        System.out.println("Dequeue->" + queue.dequeue());
    }
}
