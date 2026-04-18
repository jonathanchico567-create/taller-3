

import java.util.Stack;

public class UtilPila {

    public static boolean balanceado(String exp) {
        Stack<Character> pila = new Stack<>();

        for (char c : exp.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            } else if (c == ')' || c == '}' || c == ']') {

                if (pila.isEmpty()) return false;

                char tope = pila.pop();

                if ((c == ')' && tope != '(') ||
                    (c == '}' && tope != '{') ||
                    (c == ']' && tope != '[')) {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }
}