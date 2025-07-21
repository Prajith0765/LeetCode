class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        char first = s.charAt(0);
        sb.append(first);
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == first){
                count++;
                if(count < 3){
                    sb.append(c);
                }
            } else {
                first = c;
                count = 1;
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
