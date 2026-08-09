import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < moves.length; i++) {
            int idx = 0;
            
            while (idx < board.length && board[idx][moves[i]-1] == 0) idx++;
            if (idx == board.length) continue;
            
            if (stack.isEmpty()) stack.push(board[idx][moves[i]-1]);
            else if (stack.peek() == board[idx][moves[i]-1]) {
                stack.pop();
                answer++;
            }
            else stack.push(board[idx][moves[i]-1]);
            
            board[idx][moves[i]-1] = 0;
        }
        
        return answer*2;
    }
}