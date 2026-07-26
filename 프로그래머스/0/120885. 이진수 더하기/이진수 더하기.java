class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        Long n = Long.parseLong(bin1) + Long.parseLong(bin2);
        String[] add = String.valueOf(n).split("");
        
        for (int i = add.length-1; i > 0; i--) {
            if (add[i].equals("2")) {
                add[i] = "0";
                add[i-1] = (Long.parseLong(add[i-1]) + 1)+"";
            } else if (add[i].equals("3")) {
                add[i] = "1";
                add[i-1] = (Long.parseLong(add[i-1]) + 1)+"";
            }
        }
        
        if (add[0].equals("2")) add[0] = "10";
        else if (add[0].equals("3")) add[0] = "11";
        
        for (String s : add) {
            answer += s;
        }
        
        return answer;
    }
}