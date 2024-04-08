class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int squarestudcount = 0 , circlestudcount = 0;
        for(int i : students){
            if(i == 1){
                squarestudcount++;
            }
            else{
                circlestudcount++;
            }
        }
        
        for(int i : sandwiches){
            if(i == 1){
                if(squarestudcount > 0){
                    squarestudcount--;
                }
                else break;
            }
            
            if(i == 0){
                if(circlestudcount > 0){
                    circlestudcount--;
                }
                else break;
            }
        }
        return squarestudcount + circlestudcount;
    }
}
