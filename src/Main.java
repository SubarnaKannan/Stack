import java.util.*;
class Stack {
    int size;
    int ptr;
    int[] arr;
    Stack(int size) {
        this.size = size;
        ptr = -1;
        arr = new int[size];
    }

//    method to push elements into stack
    public void push(int val) {
        if (isFull(this))
            System.out.println("Stack OverFlow!!");
        else
            arr[++ptr] = val;
    }

//    method to pop elements in the stack
    public int pop() {
        if (isEmpty())
            System.out.println("Stack UnderFlow!!");
        return arr[ptr--];
    }

//  method to peek on a stack
    public int peek() {
        if (isEmpty())
            System.out.println("Empty Stack so cannot peek!!");
        return arr[ptr];
    }

//    method to check whether the stack is full or not
    public boolean isFull(Stack stack) {
        return (ptr == size);
    }

//    method to check the stack is empty or not
    public boolean isEmpty() {
        return (ptr == -1);
    }

//    method to display the stack
    public void display() {
        for (int i=0;i<ptr;i++)
            System.out.print(arr[i] +" ");
        System.out.println();
    }
}
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the stack: ");
        int size = sc.nextInt();
        Stack stack = new Stack(size);
        for (int i=0;i<size;i++) {
            System.out.println("Enter the element "+i);
            stack.push(sc.nextInt());
        }
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.display();
    }
}