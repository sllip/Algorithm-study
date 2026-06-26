class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String result = "";
        
        for (int i = 0; i < finished.length; i++) {
            result = (finished[i] == false) ? result+todo_list[i]+"," : result;
        }
        
        return result.split(",");
    }
}