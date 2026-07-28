class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        for (int i = 0; i < park.length; i++) {
            if (park[i].indexOf("S") != -1) {
                answer[0] = i;
                answer[1] = park[i].indexOf("S");
                break;
            }
        }
        
        for (int i = 0; i < routes.length; i++) {
            String[] route = routes[i].split(" ");
            int r = Integer.parseInt(route[1]);
            
            if (route[0].equals("E")) {
                if (answer[1]+r < park[0].length()) {
                    int j = 0;
                    for (j = 1; j <= r; j++) {
                        if (park[answer[0]].charAt(answer[1]+j) == 'X') break;
                    }
                    if (j > r) answer[1] += r;
                }
            }
            else if (route[0].equals("W")) {
                if (answer[1]-r >= 0) {
                    int j = 0;
                    for (j = 1; j <= r; j++) {
                        if (park[answer[0]].charAt(answer[1]-j) == 'X') break;
                    }
                    if (j > r) answer[1] -= r;
                }
            }
            else if (route[0].equals("S")) {
                if (answer[0]+r < park.length) {
                    int j = 0;
                    for (j = 1; j <= r; j++) {
                        if (park[answer[0]+j].charAt(answer[1]) == 'X') break;
                    }
                    if (j > r) answer[0] += r;
                }
            }
            else if (route[0].equals("N")) {
                if (answer[0]-r >= 0) {
                    int j = 0;
                    for (j = 1; j <= r; j++) {
                        if (park[answer[0]-j].charAt(answer[1]) == 'X') break;
                    }
                    if (j > r) answer[0] -= r;
                }
            }
        }
        
        return answer;
    }
}