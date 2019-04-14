import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class stack_in_java {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stackPush(stack); //pushing
        printStack(stack);// printing
        System.out.println("Popping → " + stackPop(stack)); //popping
        printStack(stack); // printing
        System.out.println("Peeking the top element of the stack to pop → " + stackPeek(stack));
        System.out.println(searchStack(stack, 3));  //searching
    }

    // pushing to stack-----------------------------------------
    static void stackPush(Stack<Integer> stack) {
        for (int a = 1; a < 11; a++) {
            stack.push(a);
        }

    }

    // poping from the stack ----------------------------------
    static int stackPop(Stack<Integer> stack) {
        return (Integer) stack.pop();
    }


    // viewing the stack --------------------------------------
    static boolean printStack(Stack<Integer> stack) {
        System.out.println(Arrays.toString(stack.toArray()));
        return true;
    }

    // peeking the top element---------------------------------
    static int stackPeek(Stack<Integer> stack) {
        return (Integer) stack.peek();

    }

    //searching in the stack---------------------------------
    static String searchStack(Stack<Integer> stack, int peram) {
        if (stack.search(peram) != -1) {
            return "Found";
        } else {
            return "Not Found";
        }
    }
}
