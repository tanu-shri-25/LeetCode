class Solution {
    public int secondHighest(String s) {
        char[] n = s.toCharArray();
        int max = -1;
        int second = -1;
        if(n.length<2){
            return -1;
        }
        for(int i =0;i<n.length;i++){
          if(Character.isDigit(n[i])){
            int digit = n[i] -'0';
            if(digit>max){
                second=max;
                max = digit;
                
            }
            else if(digit>second && digit<max){
                second = digit;
            }
          }
         
        }
        return second;
    }
}