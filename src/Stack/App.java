package Stack;

import java.util.Stack;
public class App {
    public static void main(String[] args) {
        Stack<Long> stack= new Stack<>();
        long value = 0;

        for(int i = 1; i <= 100; i++){
            value += i;
            stack.push(value * value);
        }

        while(!stack.isEmpty()){
            System.out.println("Element of the Top: " + " -> " + stack.peek());
            System.out.println("Element removed " + " -> "  + stack.peek());
            stack.pop();
        }
    }
}
