class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String str = String.join(" ", goal) + " ";
        int j = 0, k = 0;
        
        for (int i = 0; i < goal.length; i++) {
            while (j < cards1.length) {
                if (str.indexOf(cards1[j]) == 0) {
                    str = str.substring(cards1[j].length()+1);
                    j++;
                } else break;
            }
            
             while (k < cards2.length) {
                if (str.indexOf(cards2[k]) == 0) {
                    str = str.substring(cards2[k].length()+1);
                    k++;
                } else break;
            }
        }
        
        return str.length() == 0 ? "Yes" : "No";
    }
}