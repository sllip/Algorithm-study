class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String even_str = "";
        String odd_str = "";
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even_str += String.valueOf(num_list[i]);
            } else {
                odd_str += String.valueOf(num_list[i]);
            }
        }
        
        int even_int = Integer.parseInt(even_str);
        int odd_int = Integer.parseInt(odd_str);
        
        answer = even_int + odd_int;

        return answer;
    }
}