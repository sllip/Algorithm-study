class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = timelogs.length;
        
        for (int i = 0; i < schedules.length; i++) {
            int day = startday;
            
            for (int t : timelogs[i]) {
                if (day%7 == 6 || day%7 == 0) {
                    day++;
                    continue;
                }
                if ((t/100)*60 + t%100 > (schedules[i]/100)*60 + schedules[i]%100 + 10) {
                    answer--;
                    break;
                }
                day++;
            }
        }
        
        return answer;
    }
}