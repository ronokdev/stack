import java.util.Arrays;

public class stackImplimentation {
    public static void main(String[] args) {
        stack stk = new stack();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);

        System.out.println("Befor → " + stk.CurrentStack());
        System.out.println("popped item → " + stk.pop());
        System.out.println("After → " + stk.CurrentStack());
    }
}


class stack {
    static final int MAX_LIMIT = 5;
    int index;
    int[] a = new int[MAX_LIMIT];

    stack() {
        index = 0;
    }

    // pushing into the stack
    boolean push(int x) {
        if (MAX_LIMIT >= index) {
            a[index++] = x;
            return true;
        } else {
            System.out.println("Stack OVERFLOWEDDDD");
            return false;
        }

    }

    // poping from the stack
    int pop() {
        int c = a[--index];
        a[index] = 0;
        return c;
    }

    // showing the stack
    String CurrentStack() {
        return Arrays.toString(a);
    }
}
