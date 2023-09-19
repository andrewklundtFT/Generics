import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> stack;
    int top;

    public Stack () {
        stack = new ArrayList<T>();
        top = -1;
    }

    public void push (T x) {
        stack.add(x);
        top++;
    }

    public T Pop () {
        if (isEmpty()) {
            return null;
        }
        T poppedT = stack.get(stack.size()-1);
        stack.remove(top);
        top--;
        return poppedT;
    }

    public T Peek () {
        if (isEmpty()) {
            return null;
        }
        return stack.get(top);
    }

    private boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

}
