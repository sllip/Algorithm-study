class Solution {
    public int solution(String[] spell, String[] dic) {

        for (String d : dic) {
            boolean flag = false;
            if (d.length() != spell.length) continue;
            
            for (String s : spell) {
                if (!d.contains(s)) {
                    flag = true;
                    break;
                }
            }
            
            if (flag == false) return 1;
        }
            
        return 2;
    }
}