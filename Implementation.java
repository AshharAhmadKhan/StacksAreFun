import java.util.Scanner;

public class Implementation {
    int top;
    static final int MAX = 5; // Making this a constant
    int[] stack; // Array to hold stack elements

    Implementation() {
        top = -1;
        stack = new int[MAX];
    }

    public static void main(String[] args) {
        Scanner manage = new Scanner(System.in);
        Implementation imp = new Implementation();

        System.out.println("Enter " + MAX + " values into the stack:");
        for (int i = 0; i < MAX-1; i++) {
            imp.push(manage.nextInt());
        }

        System.out.println("Enter the value to push:");
        int value = manage.nextInt();
        System.out.println("Top Element After Pushing is = " + imp.push(value));
        System.out.println("Top Element After Popping is = " + imp.pop());
        System.out.println("Top Element After Peeking is = " + imp.peek());

        manage.close();
    }

    public int push(int val) {
        if (top >= MAX - 1) {
            System.out.println("Stack is full");
            return -1; // Indicate failure
        } else {
            stack[++top] = val;
            return stack[top];
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return -1; // Indicate failure
        } else {
            return stack[--top];
        }
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return -1; // Indicate failure
        } else {
            return stack[top];
        }
    }
}
