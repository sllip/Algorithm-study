class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        for (int i = 0; i < picture.length; i++) {
            
            String str = "";
            for (int j = 0; j < picture[i].length(); j++) {
                str += String.valueOf(picture[i].charAt(j)).repeat(k);
            }
            
            for (int j = i*k; j < (i*k)+k; j++) {
                answer[j] = str;
            }
        }
        
        return answer;
    }
}