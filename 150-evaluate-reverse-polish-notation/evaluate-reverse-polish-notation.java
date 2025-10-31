class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){
            if(!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")){
                stack.push(Integer.parseInt(token));
            }else{
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;

                if(token.equals("+")) result = a+b;
                else if(token.equals("-")) result = a-b;
                else if(token.equals("*")) result = a*b;
                else{
                    if(b != 0) result = a/b;
                    else result = 0;
                }
                stack.push(result);
            }
        }
        return stack.peek();
    }
}