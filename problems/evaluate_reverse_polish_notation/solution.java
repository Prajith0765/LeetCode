class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int temp;
        for(String s : tokens)
        {
            if(s.equals("+")){
                stack.add(stack.pop() + stack.pop());
            }
            else if(s.equals("-")){
                temp = stack.pop();
                stack.add(stack.pop() - temp);
            }
            else if(s.equals("*")){
                stack.add(stack.pop() * stack.pop());
            }
            else if(s.equals("/")){
                temp = stack.pop();
                stack.add(stack.pop() / temp);
            }
            else{
                stack.add(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}