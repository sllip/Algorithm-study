import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        String str = "";
        Stack<Integer> stack = new Stack<>();
        
        for (int i : ingredient) {
            stack.push(i);
            
            str += stack.pop();
            str += stack.search(3);
            str += stack.search(2);
            str += stack.search(1);
            
            if (str.equals("1123")) {
                stack.pop();
                stack.pop();
                stack.pop();
                answer++;
            }
            else stack.push(i);
            
            str = "";
        }
        
        return answer;
    }
}