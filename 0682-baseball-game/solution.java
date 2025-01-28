class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> temp=new Stack<>();
            for(int i=0;i<operations.length;i++){
                String op = operations[i];
                if(op.equals("C")){
                    temp.pop();
                }

                else if(op.equals("D")){
                    int lastscore=temp.peek();
                    temp.push(lastscore*2);
                }

               else if(op.equals("+"))
               {
                int lastScore = temp.pop();
                int secondLastScore = temp.peek();
                temp.push(lastScore);  
                temp.push(lastScore + secondLastScore);  
            } 

            else {
                temp.push(Integer.parseInt(op));
            }
        }
        
        int total = 0;
        while (!temp.isEmpty()) {
            total += temp.pop();
        }
        return total;
    }
}
