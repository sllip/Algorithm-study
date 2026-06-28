class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        String result = "";
        
        for (int i = 0; i < flag.length; i++) {
            if (flag[i] == true) {
                for (int j = 0; j < arr[i]*2; j++) {
                    result += arr[i];
                }
            } else {
                result = result.substring(0, result.length()-arr[i]);
            }
        }
        
        int[] answer = new int[result.length()];
        
        for (int i = 0; i < result.length(); i++) {
            answer[i] = Character.getNumericValue(result.charAt(i));
        }
        
        return answer;
    }
}