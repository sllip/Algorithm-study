class Solution {
    public String solution(String code) {
        String answer = "";
        
        int mode = 0;
        
        for (int idx = 0; idx < code.length(); idx++) {
            if (code.charAt(idx) == '1') {
                mode = (mode == 0) ? 1 : 0;
                continue;
            }
            
            switch (mode) {
                case 1:
                    if (idx % 2 != 0) {
                        answer += code.charAt(idx);
                    }
                    break;
                    
                case 0:
                    if (idx % 2 == 0) {
                        answer += code.charAt(idx);
                    }
                    break;
            }
        }
        
        return answer.equals("") ? "EMPTY" : answer;
    }
}