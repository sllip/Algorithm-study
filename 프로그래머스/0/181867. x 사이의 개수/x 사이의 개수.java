class Solution {
    public int[] solution(String myString) {
        myString += "x ";
        String[] str = myString.split("x");
        int[] answer = new int[str.length-1];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = str[i].length();
        }
        
        return answer;
    }
}