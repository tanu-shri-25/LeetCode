class Solution {
    public int mostWordsFound(String[] sentences) {
     int max=0;
     for(int i=0;i<sentences.length;i++){
        String[] word = sentences[i].split(" ");
        int length = word.length;

        if(length>max){
            max=length;
        }
     } 
     return max;  
    }
}