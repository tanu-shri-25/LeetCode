class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length()){
            return s;
        }
        int cur_row = 0, step =1;
        ArrayList<Character>[] rows = new ArrayList[numRows];
        for(int i=0;i<numRows;i++){
            rows[i] = new ArrayList<>();
        }
        for(char c : s.toCharArray()){
            rows[cur_row].add(c);
            if(cur_row == 0){
                step = 1;
            }else if(cur_row==numRows-1){
                step = -1;
            }
            cur_row += step;
        }
        StringBuilder result = new StringBuilder();
        for(ArrayList<Character> row : rows){
            for(char c : row){
                result.append(c);
            }
        }
        
          return result.toString();
    }
   
}