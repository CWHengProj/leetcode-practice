import java.util.Stack;

class Solution2 {
    public boolean isValid(String s) {
        //manipulate a character array
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        if (charArray.length%2 ==1){
            return false;
        }
        //maybe replace the close brackets with the open so it is easier to match
        for (char c : charArray){
            //iterate through and add to stack if it is an open bracket
            if (c == '(' || c == '{' || c == '['){
                stack.add(c);
            }
            //compare if the top of the stack is a match
            switch (c){
                case '}':
                    if (stack.pop()!='{'){
                        return false;   
                    }
                case ']':
                    if (stack.pop()!='['){
                        return false;   
                    }
                case ')':
                    if (stack.pop()!='('){
                        return false;   
                    }
            }
        }
        return true;
    }
}