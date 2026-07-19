class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            quiz[i] = quiz[i].replace("+ -", "- ").replace("+ ", "- -").replace("=", "-");
            
            String[] split = quiz[i].split(" - ");
            int n = Integer.parseInt(split[0])*2;
            
            for (String s : split) {
                n -= Integer.parseInt(s);
            }
            
            answer[i] = (n == 0) ? "O" : "X";
        }
        
        return answer;
    }
}