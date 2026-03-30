class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        char[] string_arr = new char[my_string.length()];
        for (int i = 0; i < string_arr.length; i++) {
            string_arr[i] = my_string.charAt(i);
        }
        
        for (int j = 0; j < index_list.length; j++) {
            answer += string_arr[index_list[j]];
        }
        
        return answer;
    }
}