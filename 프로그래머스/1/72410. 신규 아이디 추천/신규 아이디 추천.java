class Solution {
    public String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[~!@#$%^&*()=+\\[\\]{}:?,<>/]", "").replaceAll("[.]+", ".");
        
        for (int i = 0; i < new_id.length(); i++) {
            if ((i == 0 || i == new_id.length()-1) && new_id.charAt(i) == '.') continue;
            answer += new_id.charAt(i);
        }
        
        if (answer.length() > 15) answer = answer.substring(0, 15);
        if (answer.endsWith(".")) answer = answer.substring(0, answer.length()-1);
        
        if (answer.equals("")) answer = "aaa";
        else if (answer.length() <= 2) answer += (answer.charAt(answer.length()-1)+"").repeat(3-answer.length());
        
        return answer;
    }
}