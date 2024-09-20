import java.util.Stack;

public class day12 {
    
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        
        for (char ch : s.toCharArray()) {
         
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            
            else if (ch == ')' || ch == '}' || ch == ']') {
              
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
      
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "[{()}]";
        boolean result = isValid(s);
        System.out.println(result);  
    }
}
