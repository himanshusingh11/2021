package Day11;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s ){
        Stack<Character>stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stack.add(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if(c==']' && stack.peek()!='[') return false;
                if(c==')' && stack.peek()!='(') return false;
                if(c=='}' && stack.peek()!='{') return false;

                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));

    }
}


// time complexity O(n)
// space complexity O(n)