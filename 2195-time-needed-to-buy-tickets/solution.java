class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
       Queue<Integer> queue = new LinkedList<>();

       for(int i = 0 ; i < tickets.length; i++){
        queue.add(i);
       }
       int time = 0;
       while(!queue.isEmpty()){
        time++;
        int person = queue.poll();
        if(tickets[person] >= 1){
            tickets[person]--;
        }
        if(person == k && tickets[person] == 0){
            break;
        }
        if(person != k && tickets[person] == 0){
            continue;
        }
        queue.add(person);
       }
       return time;
    }
}
