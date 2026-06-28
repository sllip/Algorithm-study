class Solution {
    public String[] solution(String myStr) {
        
        myStr = myStr.replaceAll("[abc]+", ",");
        myStr = myStr.charAt(0) == ',' ? myStr.substring(1) : myStr;
        myStr = myStr == "" ? "EMPTY" : myStr;
        
        return myStr.split(",");
    }
}