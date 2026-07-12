import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        String answer = "";
        HashMap<String, Character> map = new HashMap<>(26);
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        char alp = 97;
        for (String m : morse) {
            map.put(m, alp);
            alp++;
        }
        
        for (String l : letter.split(" ")) {
            answer += map.get(l);
        }
        
        return answer;
    }
}