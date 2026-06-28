class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replace("a", " ").replace("b", " ").replace("c", " ");
        
        while (myStr.contains("  ")) {
            myStr = myStr.replace("  ", " ");
        }
        
        if (myStr.startsWith(" ")) {
            myStr = myStr.substring(1, myStr.length());
        }
        
        String[] answer = myStr.split(" ");
        
        if (answer[0].equals("")) {
            answer[0] = "EMPTY";
        }
        
        return answer;
    }
}