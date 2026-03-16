class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for(String token: tokens){
            if(isOperator(token)){
                int b = stack.pop();
                int a = stack.pop();
                result = applyOperator(a, b, token);
                stack.push(result);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
    public boolean isOperator(String token){
            return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
    public int applyOperator(int a, int b, String op){
        switch(op){
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            default : throw new IllegalArgumentException(op);
        }
    }
}