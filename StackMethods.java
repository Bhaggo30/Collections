import java.util.Stack;
public class StackMethods {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        stack.push("java");
        stack.push("sql");
        stack.push("springboot");
        stack.push("hibernate");
        stack.push("javascript");

        System.out.println(stack);
        System.out.println(stack.toString()); // works same as refrence variable
        for (int i =0; i<stack.size();i++){   // 2 way
            System.out.println(stack.get(i));
        }
        System.out.println(stack.size());
        System.out.println(stack.peek()); // gives the last element
        System.out.println(stack.search("hibernate"));
        stack.pop();  // started remove the elemnt at the last
        System.out.println(stack);




    }
}
