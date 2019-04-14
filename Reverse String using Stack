import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringWIthStack {
    public static void main(String[] args) {

        // takeing user input
        String user_input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string that you want to Reverse → ");
        user_input = sc.nextLine();

        final String CHAR_TO_REVERSE = user_input;
        String push_result, pop_result;

        int leng = CHAR_TO_REVERSE.length();
        ReverseString rs = new ReverseString(leng);
        rs.push(CHAR_TO_REVERSE, leng);
        pop_result = rs.pop(leng);
        System.out.println(pop_result);


    }
}

class ReverseString {
    final int MAX_LIMIT;
    int index;
    char[] a;

    // setting the max length ---------------------------
    ReverseString(int max_length) {
        MAX_LIMIT = max_length;
        a = new char[MAX_LIMIT];
        index = 0;
    }

    // pushing into the stack ----------------------------------
    boolean push(String full_string, int leng) {
        if (MAX_LIMIT >= leng) {
            for (int x = 0; x < leng; x++) {
                a[index++] = full_string.charAt(x);
            }

            return true;
        } else {
            System.out.println("Stack OVERFLOWEDDDD");
            return false;
        }
    }

    // poping from the stack------------------------------------
    String pop(int len) {
        char[] z = new char[len];
        int y;

        for (y = 0; y < len; y++) {
            z[y] = a[--index];
        }
        String final_string = new String(z);
        return final_string;
    }


    // showing the current stack-------------------------
    String CurrentStack() {
        return Arrays.toString(a);
    }

}
