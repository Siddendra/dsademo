package stack.arrayList;

public class StackMain {

    /*
    Queue Using Stacks: Enqueue ( ** Interview Question)
    Implement the Enqueue Method for a Queue using Two Stacks
     */
    public void enqueue(int value) {

    }

    //Stack: Sort Stack ( ** Interview Question)
    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> additionalStack = new Stack<>();
        while(!stack.isEmpty()) {
            int temp = stack.pop();
            while(!additionalStack.isEmpty() && additionalStack.pop() > temp) {
                stack.push(additionalStack.pop());
            }
            additionalStack.push(temp);
        }
        while (!additionalStack.isEmpty()) {
            stack.push(additionalStack.pop());
        }
    }

    //Stack: Parentheses Balanced ( ** Interview Question)
    public boolean isBalancedParentheses(String parentheses) {
        Stack<Character> stack = new Stack<>();
        for(char p: parentheses.toCharArray()) {
            if(p == '(') {
                stack.push(p);
            } else if(p == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    //Stack: Reverse String
    public static String reverseString(String string) {
      Stack<Character> stack = new Stack<>();
      String reverseString = "";
      for(char c: string.toCharArray()) {
          stack.push(c);
      }
      while(!stack.isEmpty()) {
          reverseString += stack.pop();
      }
      return reverseString;
    }

    public static void main(String[] args) {

        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);

        Stack myStack = new Stack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println("Stack before pop():");
        myStack.printStack();

        System.out.println("\nPopped node:");
        System.out.println(myStack.pop());

        System.out.println("\nStack after pop():");
        myStack.printStack();

        /*
            EXPECTED OUTPUT:
            Stack before pop():
            3
            2
            1

            Popped node:
            3

            Stack after pop():
            2
            1

        */

    }

}
