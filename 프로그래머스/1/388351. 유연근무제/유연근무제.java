class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = timelogs.length;
        
        for (int i = 0; i < schedules.length; i++) {
            int day = startday;
            int s = schedules[i];
            
            for (int t : timelogs[i]) {
                if (day%7 == 6 || day%7 == 0) {
                    day++;
                    continue;
                }
                if ((t/100)*60 + t%100 > (s/100)*60 + s%100 + 10) {
                    answer--;
                    break;
                }
                day++;
            }
        }
        
        return answer;
    }
}