class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        for(String k: keyinput) {
            if(k.equals("up") && answer[1] < board[1]/2) {
                answer[1]++;
            } else if (k.equals("down") && answer[1] > -board[1]/2) {
                answer[1]--;
            }else if (k.equals("left") && answer[0] > -board[0]/2) {
                answer[0]--;
            }else if (k.equals("right") && answer[0] < board[0]/2) {
                answer[0]++;
            }
        }

        return answer;
    }
}