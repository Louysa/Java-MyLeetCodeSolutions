import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("{()"));

    }
    public static boolean isValid(String s){
        Stack<Character> s1 = new Stack<Character>();
        char[] a = s.toCharArray();
        for(char c : a) {
            if (c == '(')
                s1.push(')');
            else if (c == '{')
                s1.push('}');
            else if (c == '[')
                s1.push(']');
            else if (s1.isEmpty() || s1.pop() != c)
                return false;
        }
        return s1.isEmpty();
    }
}