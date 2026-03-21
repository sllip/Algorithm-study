import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        for (char str1 : a.toCharArray()) {
            System.out.print(str1);
        }
        for (char str2 : b.toCharArray()) {
            System.out.print(str2);
        }
    }
}