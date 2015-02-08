public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        int stringLengh = s.length();
        
        for (int x = 0; x < stringLengh; x++)
        {
            char currentChar = s.charAt(x);
            
            if (currentChar == '{'){
                stack.push('}');
            }
            else if (currentChar == '['){
                stack.push(']');
            }
            else if (currentChar == '('){
                stack.push(')');
            }
            else
            {
                if (stack.size() == 0){
                    return false;
                }
                
                char lastClosingChar = (char)stack.pop();

                if (lastClosingChar != currentChar)
                    return false;
            }
        }
        
        if(stack.size() > 0){
            return false;
        }
        return true;
    }
}