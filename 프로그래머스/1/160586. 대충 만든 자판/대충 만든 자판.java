class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int min = 100;
        int idx = 0, click = 0;
        boolean flag = false;
        
        for (int i = 0; i < targets.length; i++) {
            
            for (int j = 0; j < targets[i].length(); j++) {
                
                for (int k = 0; k < keymap.length; k++) {
                    idx = keymap[k].indexOf(String.valueOf(targets[i].charAt(j)));
                    if (idx == -1) {
                        if ((min == 100) && (k == keymap.length-1)) {
                            flag = true;
                            break;
                        } else {
                            continue;
                        }
                    } else if (idx < min) {
                        min = idx;
                    }
                }
                
                if (flag && (idx == -1)) {
                    click = -1;
                    flag = false;
                    break;
                }
                
                click += (min+1);
                min = 100;
            }
            
            answer[i] = click;
            click = 0;
        }
        
        return answer;
    }
}