package java_collections.stack;

import java.util.Stack;

public class BalancedStringProblem {

    public static void main(String[] args) {
        String st = "(2+) [{4}]";
        System.out.println(isBalanced(st));
    }

    public static boolean isBalanced(String s){
        Stack stack = new Stack();

        for (char c: s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
                if (c==')' || c==']' || c=='}'){
                    Character top = (char)stack.pop();
                    if ((top =='(' && c!=')' ) || (top == '[' && c!=']') || (top =='{' && c=='}')){
                        return false;

                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
