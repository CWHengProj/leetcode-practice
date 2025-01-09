import java.util.Stack;

class Solution2 {
    public boolean isValid(String s) {
        //manipulate a character array
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        if (charArray.length%2 ==1 || charArray.length==0){
            return false;
        }
        for (char c : charArray){
            //iterate through and add to stack if it is an open bracket
            if (c == '(' || c == '{' || c == '['){
                stack.add(c);
            }
            //if it starts off with close bracket and there is nothing to pop then return false
            //compare if the top of the stack is a match
            switch (c){
                case '}':
                    if (stack.size()==0 || stack.pop()!='{'){
                        return false;   
                    }
                    break;
                case ']':
                    if (stack.size()==0 || stack.pop()!='['){
                        return false;   
                    }
                    break;
                case ')':
                    if (stack.size()==0 || stack.pop()!='('){
                        return false;   
                    }
                    break;
            }
        }
        if (stack.size()==0)
            return true;
        return false;
    }
}