class MinStack {
    // Each element stores both the value and the min at that time
    Stack<int[]> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        // If stack is empty, current value is the minimum
        if (stack.isEmpty()) {
            stack.push(new int[]{val, val});
        } else {
            int currentMin = stack.peek()[1];
            // Store the smaller of current value and existing min
            stack.push(new int[]{val, Math.min(val, currentMin)});
        }
    }

    public void pop() {
        stack.pop(); // simply remove the top pair
    }

    public int top() {
        return stack.peek()[0]; // return the value part
    }

    public int getMin() {
        return stack.peek()[1]; // return the min part
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */