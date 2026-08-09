import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int m : moves) {
            int idx = 0;
            
            while (idx < board.length && board[idx][m-1] == 0) idx++;
            if (idx == board.length) continue;
            
            if (stack.isEmpty()) stack.push(board[idx][m-1]);
            else if (stack.peek() == board[idx][m-1]) {
                stack.pop();
                answer += 2;
            }
            else stack.push(board[idx][m-1]);
            
            board[idx][m-1] = 0;
        }
        
        return answer;
    }
}