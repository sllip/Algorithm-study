import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int a = 0, b = 0, c = 0;
        int[] arr = Arrays.copyOf(rank, rank.length);
        
        for (int i = 0; i < arr.length; i++) {
            if (attendance[i] == false) {
                arr[i] = 101;
            }
        }
        
        Arrays.sort(arr);
        
        for (int i = 0; i < rank.length; i++) {
            if (rank[i] == arr[0]) {
                a = i;
            } else if (rank[i] == arr[1]) {
                b = i;
            } else if (rank[i] == arr[2]) {
                c = i;
            }
        }
        
        answer = 10000*a + 100*b + c;
        
        return answer;
    }
}