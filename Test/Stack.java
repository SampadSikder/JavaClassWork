
public class Stack<E> {
    private final int size;
    private int top;
    private E[] elements;

    public Stack() {
        this(10);
    }

    public Stack(int s) {
        size = s > 0 ? s : 10;
        top = -1;

        elements = (E[]) new Object[size];
    }

    public void push(E pushValue) {
        if (top == size - 1) {
            throw new FullStackException(String.format("Cannot push %s", pushValue));
        }
        elements[++top] = pushValue;
        System.out.println("Client pushed to stack " + pushValue);
    }

    public E pop() {
        if (top == -1) {
            System.out.println("Stack empty cannot pop");

            throw new EmptyStackException("Cannot pop");
        }
        return elements[top--];
    }

    public void printStack() {
        for (E element : elements) {
            System.out.printf("%s ", element);
        }
    }
}

class EmptyStackException extends RuntimeException {
    public EmptyStackException() {
        this("Stack is empty");
    }

    public EmptyStackException(String exception) {
        super(exception);
    }
}

class FullStackException extends RuntimeException {
    public FullStackException(String exception) {
        super(exception);
    }
}
