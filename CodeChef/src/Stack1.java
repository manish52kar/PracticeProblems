import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Stack1 {

    public static void main (String[] args)
    {
        //Given a string containing just characters '{','[','(',')','}',']'. Find if valid?

        String test = "{[()]}";

        System.out.println(isValid(test));
    }

    private static boolean isValid(String test) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < test.length() ; i++) {
            char ch = test.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }else{
                if (st.isEmpty()) return false;

                //check element at top of stack
                char p = st.peek();
                if (ch == '}' && p != '{') return false;
                else if (ch == ']' && p != '[') return false;
                else if (ch == ')' && p != '(') return false;
                else st.pop();
            }
        }

        return st.isEmpty();
    }
}