class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int a = 0, b = 0;
        
        for (String p : polynomial.split(" \\+ ")) {
            if (!p.endsWith("x")) {
                b += Integer.parseInt(p);
                p = p.replace(p, "0x");
            }
            
            String str = p.substring(0, p.indexOf("x"));
            a += str.equals("") ? 1 : Integer.parseInt(str);
        }
        
        if (a == 0) answer = ""+b;
        else if (a == 1) answer = (b == 0) ? "x" : "x + "+b;
        else answer = (b == 0) ? a+"x" : a+"x + "+b;
        
        return answer;
    }
}