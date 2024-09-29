import java.util.Stack;

public class day19 {

    public static int evaluatePostfix(String expression) {
       
        Stack<Integer> stack = new Stack<>();

        
        String[] tokens = expression.split(" ");

       
        for (String token : tokens) {
           
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else {
              
                int b = stack.pop();
                int a = stack.pop();
              
                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }
            }
        }

      
        return stack.pop();
    }

   
    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String expression = "2 1 + 3 *";
        System.out.println("Result: " + evaluatePostfix(expression)); 
    }
}
 
