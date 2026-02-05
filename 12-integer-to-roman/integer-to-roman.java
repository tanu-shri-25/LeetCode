class Solution {
    public String intToRoman(int num) {
    int[] value = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    String[] symbol = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};


    StringBuilder result = new StringBuilder();
    int i = value.length-1;
    while(num>0){
        int div = num/value[i];
        while(div>0){
            result.append(symbol[i]);
            div--;
        }
        num=num%value[i];
        i--;
    }
    return result.toString();
    }
}