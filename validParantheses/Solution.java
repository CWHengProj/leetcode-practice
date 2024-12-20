import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
       //check for valid parantheses - my approach would be using stack and pop to check if the closing
       //is the right pair as the opening, the most recent has to be closed by the same complement.
       Stack<Character> STACK = new Stack<>();
       //loop and add the characters to the stack, check the next one for a match
       for (char x: s.toCharArray()){
        if (STACK.isEmpty()){
            STACK.push(x);
            continue;
        }
        switch (x){
            case ')':
                if (STACK.pop()!='('){
                    return false;
                }
                break;
            case ']':
                if (STACK.pop()!='['){
                    return false;
                }
                break;
            case '}':
                if (STACK.pop()!='{'){
                    return false;
                }
                break;
            default:
                STACK.push(x);    
        }
        //push peep pop
        //if current x is not a complement of the peep, return false
        //else, pop the most recent and don't add on
       }
       if (STACK.isEmpty()){
           return true;
       }
       else{
        return false;
       }

    }
}